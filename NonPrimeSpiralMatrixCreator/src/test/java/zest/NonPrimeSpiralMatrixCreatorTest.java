package zest;
import org.junit.Test;
import static org.junit.Assert.*;

public class NonPrimeSpiralMatrixCreatorTest {
    @Test
    public void testZero() {
        int input = 0;
        int[] expected = {};
        int[] output = NonPrimeSpiralMatrixCreator.createSpiralMatrix(input);

        assertArrayEquals(expected, output);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNegative() {
        int input = -2;
        int[] output = NonPrimeSpiralMatrixCreator.createSpiralMatrix(input);
    }

    @Test
    public void testOne() {
        int input = 1;
        int[] expected = {4}; // 1 → 2 (prime), increment to 4
        int[] output = NonPrimeSpiralMatrixCreator.createSpiralMatrix(input);

        assertArrayEquals(expected, output);
    }

    @Test
    public void testTwo() {
        int input = 2;
        int[] expected = {4, 6, 9, 8}; // 1 → 4, 2 → 6, 3 → 8, 4 → 9
        int[] output = NonPrimeSpiralMatrixCreator.createSpiralMatrix(input);

        assertArrayEquals(expected, output);
    }

    @Test
    public void testThree() {
        int input = 3;
        int[] expected = {4, 6, 8, 15, 16, 9, 14, 12, 10};
        int[] output = NonPrimeSpiralMatrixCreator.createSpiralMatrix(input);

        assertArrayEquals(expected, output);
    }

    @Test
    public void testFour() {
        int input = 4;
        int[] expected = {4, 6, 8, 9, 21, 22, 24, 10, 20, 26, 25, 12, 18, 16, 15, 14};
        int[] output = NonPrimeSpiralMatrixCreator.createSpiralMatrix(input);

        assertArrayEquals(expected, output);
    }

    @Test
    public void testFive() {
        int input = 5;
        int[] expected = {4, 6, 8, 9, 10, 26, 27, 28, 30, 12, 25, 36, 38, 32, 14, 24, 35, 34, 33, 15, 22, 21, 20, 18, 16};
        int[] output = NonPrimeSpiralMatrixCreator.createSpiralMatrix(input);

        assertArrayEquals(expected, output);
    }
    @Test
    public void testEleven() {
        int input = 11;
        int[] expected = { 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20,
                57, 58, 60, 62, 63, 64, 65, 66, 68, 69, 21,
                56, 98, 99, 100, 102, 104, 105, 106, 108, 70, 22,
                55, 96, 128, 129, 130, 132, 133, 134, 110, 72, 24,
                54, 95, 126, 147, 148, 150, 152, 135, 111, 74, 25,
                52, 94, 125, 146, 158, 159, 153, 136, 112, 75, 26,
                51, 93, 124, 145, 156, 155, 154, 138, 114, 76, 27,
                50, 92, 123, 144, 143, 142, 141, 140, 115, 77, 28,
                49, 91, 122, 121, 120, 119, 118, 117, 116, 78, 30,
                48, 90, 88, 87, 86, 85, 84, 82, 81, 80, 32,
                46, 45, 44, 42, 40, 39, 38, 36, 35, 34, 33 };
        int[] output = NonPrimeSpiralMatrixCreator.createSpiralMatrix(input);

        assertArrayEquals(expected, output);
    }


}

