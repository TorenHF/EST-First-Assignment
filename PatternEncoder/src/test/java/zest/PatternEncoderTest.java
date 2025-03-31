package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PatternEncoderTest {

    @Test
    void simpleTest() {
        assertEquals("2[a]3[b]4[c]", PatternEncoder.encodeString("aabbbcccc"));
    }

    @Test
    void singleTest() {
        assertEquals("a", PatternEncoder.encodeString("a"));
    }

    @Test
    void emptyTest() {
        assertEquals("", PatternEncoder.encodeString(""));
    }

    @Test
    void nullTest() {
        assertNull(PatternEncoder.encodeString(null));
    }

    @Test
    void againTest() {
        assertEquals("3[a]2[bc]", PatternEncoder.encodeString("aaabcbc"));
    }

    @Test
    void alternatingTest() {
        assertEquals("abcd", PatternEncoder.encodeString("abcd"));
    }

    @Test
    void edgeCaseTest() {
        assertEquals("1[1]1[2]1[3]1[4]1[5]", PatternEncoder.encodeString("12345"));
    }
}
