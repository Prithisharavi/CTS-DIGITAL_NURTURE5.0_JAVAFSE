package junit.JUnit_Advanced_Testing.Exercise_4_Exception_Testing;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {
    @Test
    void testThrowException() {
        ExceptionThrower exceptionThrower = new ExceptionThrower();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> exceptionThrower.throwException());

        assertEquals("This is an IllegalArgumentException", exception.getMessage());
    }
}