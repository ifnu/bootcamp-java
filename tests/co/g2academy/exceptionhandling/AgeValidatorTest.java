package co.g2academy.exceptionhandling;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class AgeValidatorTest {
    AgeValidator validator = new AgeValidator();

    @Test
    public void testValidAgeValidator(){
        boolean actual = validator.validate(25);
        assertTrue(actual);
    }

    @Test
    public void testInvalidAgeValidator() {
        try {
            validator.validate(10);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testHandleCheckedExeptionWithTryAndCatch(){
        try {
            boolean actual = validator.validateGender("male");
            assertTrue(actual);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testHandleCheckedExceptionWithThrowItFurtherToMethodCaller()  throws FileNotFoundException {
        boolean actual = validator.validateGender("femail");
    }

}