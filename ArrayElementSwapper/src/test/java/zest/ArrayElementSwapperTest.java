package zest;


import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ArrayElementSwapperTest {
    // empty List
    @Test
    public void testEmpty() {
        int[] input = {};
        int[] expected = {};

        ArrayElementSwapper.swapElements(input);
        assertArrayEquals(expected, input);
    }

    // All positive
    @Test
    public void testAllPositive() {
        int[] input = {3, 2, 5, 6, 1, 4};
        int[] expected = {3, 2, 5, 6, 1, 4};

        ArrayElementSwapper.swapElements(input);
        assertArrayEquals(expected, input);
    }

    // All negative
    @Test
    public void testAllNegative() {
        int[] input = {-3, -2, -5, -6, -1, -4};
        int[] expected = {-3, -2, -5, -6, -1, -4};

        ArrayElementSwapper.swapElements(input);
        assertArrayEquals(expected, input);
    }
    // All elements need to be swapped
    @Test
    public void testAllSwap() {
        int[] input = {3, 1, -9, -1, -4};
        int[] expected = {-9, -1, -4, 3, 1};

        ArrayElementSwapper.swapElements(input);
        assertArrayEquals(expected, input);
    }
    // Lots of zeros
    @Test
    public void testZeros() {
        int[] input = {0, 2, 5, -6, -1, 0, 0,};
        int[] expected = {-6, -1, 0, 2, 5, 0, 0};

        ArrayElementSwapper.swapElements(input);
        assertArrayEquals(expected, input);
    }
    // Negative 0
    @Test
    public void testNegativeZeros() {
        int[] input = {0, 2, 8, -6, -1, -0, 0,};
        int[] expected = {-6, -1, 0, 2, 8, -0, 0};

        ArrayElementSwapper.swapElements(input);
        assertArrayEquals(expected, input);
    }
    // Already Correct order
    @Test
    public void testAlreadyCorrect() {
        int[] input = {-1, -2, -1, -6, 7, 8, 1, 4, 22};
        int[] expected = {-1, -2, -1, -6, 7, 8, 1, 4, 22};

        ArrayElementSwapper.swapElements(input);
        assertArrayEquals(expected, input);
    }


}
