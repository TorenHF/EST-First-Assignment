package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringTransformerTest {

    @Test
    void identicalTest() {
        assertEquals(0, StringTransformer.minOperations("hello", "hello"));
    }

    @Test
    void insertTest() {
        assertEquals(3, StringTransformer.minOperations("kitten", "sitting"));
    }

    @Test
    void removeTest() {
        assertEquals(3, StringTransformer.minOperations("horse", "ros"));
    }

    @Test
    void replaceTest() {
        assertEquals(2, StringTransformer.minOperations("flaw", "lawn"));
    }

    @Test
    void mixedOperationsTest() {
        assertEquals(5, StringTransformer.minOperations("intention", "execution"));
    }

    @Test
    void emptyToNonEmptyTest() {
        assertEquals(5, StringTransformer.minOperations("", "world"));
    }

    @Test
    void nonEmptyToEmptyTest() {
        assertEquals(4, StringTransformer.minOperations("test", ""));
    }
}
