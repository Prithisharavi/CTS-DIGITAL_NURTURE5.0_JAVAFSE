package junit.JUnit_Advanced_Testing.Exercise_2_Test_Suites;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(50, calc.multiply(10, 5));
    }
}