package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PatternEncoderTest {

    @Test
    void simpleTest() {
        assertEquals("2[a]3[b]4[c]", PatternEncoder.encodeString("aabbbcccc"));
    }


    @Test
    void emptyTest() {
        assertEquals("", PatternEncoder.encodeString(""));
    }

    @Test
    void nullTest() {
        assertNull(PatternEncoder.encodeString(null));
    }

   /* @Test
    void multTest() {
        assertEquals("3[a]2[bc]", PatternEncoder.encodeString("aaabcbc"));
    }
i should prolly rtfm first*/


    @Test
    void edgeCaseTest() {
        assertEquals("asdfg", PatternEncoder.encodeString("asdfg"));
    }
}
