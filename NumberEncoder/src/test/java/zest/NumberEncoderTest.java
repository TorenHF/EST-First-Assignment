package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberEncoderTest {

    @Test
    void ValidTest() {
        char[] mapping = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        assertEquals("ABCDEF", NumberEncoder.encodeNumber("012345", mapping));
        assertEquals("JIHGFE", NumberEncoder.encodeNumber("987654", mapping));
    }

    @Test
    void EmptyTest() {
        char[] mapping = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        assertEquals("", NumberEncoder.encodeNumber("", mapping));
    }

    @Test
    void IllegalTest() {
        char[] mapping = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        assertThrows(IllegalArgumentException.class, () -> NumberEncoder.encodeNumber("12a3", mapping));
    }

    @Test
    void NegativeTest() {
        char[] mapping = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        assertThrows(IllegalArgumentException.class, () -> NumberEncoder.encodeNumber("-12", mapping));
    }

    @Test
    void InsufficientTest() {
        char[] mapping = {'A', 'B', 'C', 'D', 'E'}; // Less than 10 elements
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> NumberEncoder.encodeNumber("012", mapping));
    }
}
