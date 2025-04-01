package zest;

import org.junit.Test;
import static org.junit.Assert.*;

public class FractionToDecimalTest {

    @Test
    public void testOne(){
        int numerator = 1;
        int denominator = 1;
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        String expected = "1";

        assertEquals(expected, result);

    }
    @Test
    public void testZeroDenominatorReturnsNull() {
        int numerator = 1;
        int denominator = 0;

        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);

        assertNull(result);
    }

    @Test
    public void testZero(){
        int numerator = 0;
        int denominator = 5;
        String expected = "0";
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        assertEquals(expected, result);
    }

    @Test
    public void testOneResult(){
        int numerator = 4456;
        int denominator = 4456;
        String expected = "1";
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        assertEquals(expected, result);
    }


    @Test
    public void testNonRepeating(){
        int numerator = 1;
        int denominator = 2;
        String expected = "0.5";
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        assertEquals(expected, result);
    }

    @Test
    public void testLongRepeating(){
        int numerator = 1;
        int denominator = 7;
        String expected = "0.(142857)";
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        assertEquals(expected, result);
    }


    @Test
    public void testNonRepeatingThenRepeating(){
        int numerator = 1;
        int denominator = 6;
        String expected = "0.1(6)";
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        assertEquals(expected, result);
    }


    @Test
    public void testGreaterThanOneRepeating(){
        int numerator = 8;
        int denominator = 3;
        String expected = "2.(6)";
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        assertEquals(expected, result);
    }


    @Test
    public void testNegativeNumerator(){
        int numerator = -1;
        int denominator = 2;
        String expected = "-0.5";
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        assertEquals(expected, result);
    }


    @Test
    public void testNegativeDenominator(){
        int numerator = 1;
        int denominator = -2;
        String expected = "-0.5";
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        assertEquals(expected, result);
    }

    @Test
    public void testBothNegative(){
        int numerator = -1;
        int denominator = -2;
        String expected = "0.5";
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        assertEquals(expected, result);
    }


    @Test
    public void testNegativeZero(){
        int numerator = -0;
        int denominator = 3;
        String expected = "0";
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        assertEquals(expected, result);
    }


    @Test
    public void testZeroNumeratorNegativeDenom(){
        int numerator = 0;
        int denominator = -3;
        String expected = "0";
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        assertEquals(expected, result);
    }


}