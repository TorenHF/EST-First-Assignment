package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {

    @Test
    void palindromeTest() {
        assertTrue(PalindromeNumber.isPalindrome(121));
    }

    @Test
    void negativeTest() {
        assertFalse(PalindromeNumber.isPalindrome(-121));
    }

    @Test
    void wrongPalindromeTest() { assertFalse(PalindromeNumber.isPalindrome(21)); }

    @Test
    void singleTest() {
        assertTrue(PalindromeNumber.isPalindrome(7));
    }


    @Test
    void illegalTest() {
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("12a21");
        });
    }
}
