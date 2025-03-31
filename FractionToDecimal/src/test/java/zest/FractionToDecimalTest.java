package zest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FractionToDecimalTest {

    @Test
    public void testOne(){
        int numerator = 1;
        int denominator = 1;
        String result = FractionToDecimal.fractionToDecimal(numerator, denominator);
        String expected = "1";

        assertEquals(output, expected);


    }

 
}