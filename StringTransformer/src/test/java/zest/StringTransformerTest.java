package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTransformerTest {

    @Test
    void identicalTest() {
        assertEquals(0, StringTransformer.minOperations("test", "test"));
    }

    @Test
    void classicTest() {
        assertEquals(2, StringTransformer.minOperations("bigger", "beggar"));
    }

    @Test
    void removeTest() {
        assertEquals(1, StringTransformer.minOperations("world", "word"));
    }

    @Test
    void replaceTest() {
        assertEquals(1, StringTransformer.minOperations("stitch", "snitch"));
    }

    @Test
    void mixedOperationsTest() {
        assertEquals(4, StringTransformer.minOperations("intention", "interventions"));
    }

    @Test
    void emptyToNonEmptyTest() {
        assertEquals(5, StringTransformer.minOperations("", "tests"));
    }

    @Test
    void nonEmptyToEmptyTest() {
        assertEquals(4, StringTransformer.minOperations("test", ""));
    }
}
