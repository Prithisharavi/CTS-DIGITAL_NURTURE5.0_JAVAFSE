package junit.JUnit_Basic_Testing.Exercise_2_Writing_Basic_JUnit_Tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class MathOperationsTest {
    @Test
    public void testAdd() {
        MathOperations math = new MathOperations();
        assertEquals(10, math.add(4, 6));
    }
    @Test
    public void testMultiply() {
        MathOperations math = new MathOperations();
        assertEquals(20, math.multiply(4, 5));
    }
}