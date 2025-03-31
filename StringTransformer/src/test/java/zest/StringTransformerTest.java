package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTransformerTest {

    @Test
    void identTest() {
        assertEquals(0, StringTransformer.minOperations("test", "test"));
    }

    @Test
    void mixed1Test() {
        assertEquals(3, StringTransformer.minOperations("bigger", "beggars"));
    }

    @Test
    void rmTest() {
        assertEquals(1, StringTransformer.minOperations("world", "word"));
    }

    @Test
    void replaceTest() {
        assertEquals(1, StringTransformer.minOperations("stitch", "snitch"));
    }

    @Test
    void mixed2Test() {
        assertEquals(4, StringTransformer.minOperations("intention", "interventions"));
    }

    @Test
    void emptyTest() {
        assertEquals(5, StringTransformer.minOperations("", "tests"));
    }

    @Test
    void toEmptyTest() {
        assertEquals(4, StringTransformer.minOperations("test", ""));
    }
}
