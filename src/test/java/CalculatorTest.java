import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator testcalc;

    @Before
    public void before(){
        testcalc = new Calculator();
    }

    @Test
    public void testAddition(){
        assertEquals(5, testcalc.addition(2,3));
    }

    @Test
    public void testSubtraction(){
        assertEquals(7, testcalc.subtraction(10,3));
    }

    @Test
    public void testMultiplication(){
        assertEquals(6, testcalc.multiplication(2,3));
    }

    @Test
    public void testDivision(){
        assertEquals(3, testcalc.division(15,5));
    }


}
