package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {

    @Test
    void testPositivePalindrome() {
        assertTrue(PalindromeNumber.isPalindrome(121));
    }

    @Test
    void testNegativeNumber() {
        assertFalse(PalindromeNumber.isPalindrome(-121));
    }

    @Test
    void testSingleDigitNumber() {
        assertTrue(PalindromeNumber.isPalindrome(7));
    }


    @Test
    void testIllegalCharacter() {
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("12a21");
        });
    }
}
