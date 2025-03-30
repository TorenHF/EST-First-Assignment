package zest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ConsecutiveElementsSumTest {
    // empty List
    @Test
    public void testEmpty() {
        int[] input = {};
        int expected = 0;

        int output = ConsecutiveElementsSum.maxConsecutiveSum(input);
        assertEquals(expected, output);
    }

    // length = 1
    @Test
    public void testOne() {
        int[] input = {55};
        int expected = 55;

        int output = ConsecutiveElementsSum.maxConsecutiveSum(input);
        assertEquals(expected, output);
    }


    // Only Negative
    @Test
    public void testNegative() {
        int[] input = {-1, -2, -7, -9, -5, -2};
        int expected = -1;

        int output = ConsecutiveElementsSum.maxConsecutiveSum(input);
        assertEquals(expected, output);
    }

    // 0
    @Test
    public void testZero() {
        int[] input = {-1, -2, 0, -7, -9, -5, -2};
        int expected = 0;

        int output = ConsecutiveElementsSum.maxConsecutiveSum(input);
        assertEquals(expected, output);
    }

    // Whole list
    @Test
    public void testWhole() {
        int[] input = {1, 2, 7, -3, 9, 5, -1, 2};
        int expected = 22;

        int output = ConsecutiveElementsSum.maxConsecutiveSum(input);
        assertEquals(expected, output);
    }

    // One single element
    @Test
    public void testSingleElement() {
        int[] input = {1, 2, 7, -8, -3, 17, -9, 5, -3, 2};
        int expected = 17;

        int output = ConsecutiveElementsSum.maxConsecutiveSum(input);
        assertEquals(expected, output);
    }

    // Last element
    @Test
    public void testLastElement() {
        int[] input = {1, 2, 7, -8, -3, 17, -9, 5, -3, -19, 22};
        int expected = 22;

        int output = ConsecutiveElementsSum.maxConsecutiveSum(input);
        assertEquals(expected, output);
    }

    // First element
    @Test
    public void testFirstElement() {
        int[] input = {23, -25, 1, 2, 7, -8, -3, 17, -9, 5, -3, -19, 22};
        int expected = 23;

        int output = ConsecutiveElementsSum.maxConsecutiveSum(input);
        assertEquals(expected, output);
    }

}
