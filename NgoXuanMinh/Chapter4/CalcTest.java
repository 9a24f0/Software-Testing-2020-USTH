import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    Calc calculate = new Calc();
    private int a = 5, b = 3;

    @Test
    public void testMinus () {
        assertEquals(calculate.minus(a,b), 2);
    }

    @Test
    public void testMultiply() {
        assertEquals(calculate.multiply(a,b), 15);
    }

    @Test
    public void testDivide() {
        assertEquals(calculate.divide(a,b), 5.0/3.0, 0.000001);
    }
}