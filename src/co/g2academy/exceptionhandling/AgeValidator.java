package co.g2academy.exceptionhandling;

import java.io.FileNotFoundException;

public class AgeValidator {

    public boolean validate(int age) { // no throws keyword
        if(age < 18) {
            //unchecked exceptions
            throw new ArithmeticException("age is not valid");
        } else{
            return true;
        }
    }

    public boolean validateGender(String gender) throws FileNotFoundException {
        if(gender.equals("male") || gender.equals("female")){
            return true;
        } else {
            throw new FileNotFoundException("Gender is not found");
        }
    }

}
