package junit.JUnit_Basic_Testing.Exercise_4_AAA_Pattern;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setup Method Executed");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Teardown Method Executed");
        calculator = null;
    }

    @Test
    public void testAdd() {
        int a = 10;
        int b = 20;
        int result = calculator.add(a, b);
        assertEquals(30, result);
    }
