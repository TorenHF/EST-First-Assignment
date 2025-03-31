package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Stack;

class ParenthesesValidatorTest {

    @Test
    void PairsTest() {
        assertTrue(ParenthesesValidator.isValid("()"));
        assertTrue(ParenthesesValidator.isValid("{}"));
        assertTrue(ParenthesesValidator.isValid("[]"));
    }

    @Test
    void nestedTest() {
        assertTrue(ParenthesesValidator.isValid("({[]})"));
        assertTrue(ParenthesesValidator.isValid("[({})]"));
    }

    @Test
    void consecutiveTest() {
        assertTrue(ParenthesesValidator.isValid("(){}[]"));
    }

    @Test
    void mismatchedTest() {
        assertFalse(ParenthesesValidator.isValid("(]"));
        assertFalse(ParenthesesValidator.isValid("{)"));
    }

    @Test
    void openedTest() {
        assertFalse(ParenthesesValidator.isValid("({["));
    }

    @Test
    void closedTest() {
        assertFalse(ParenthesesValidator.isValid(")}"));
    }

    @Test
    void emptyTest() {
        assertTrue(ParenthesesValidator.isValid(""));
    }
}
