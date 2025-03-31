package zest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {

    @Test
    void PalindromeTest() {
        assertTrue(PalindromeNumber.isPalindrome(121));
    }

    @Test
    void NegativeTest() {
        assertFalse(PalindromeNumber.isPalindrome(-121));
    }

    @Test
    void SingleTest() {
        assertTrue(PalindromeNumber.isPalindrome(7));
    }


    @Test
    void IllegalTest() {
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("12a21");
        });
    }
}
