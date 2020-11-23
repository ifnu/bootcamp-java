package co.g2academy.oop;
import org.junit.Test;
import static org.junit.Assert.*;
public class MyCalculationTest {
    @Test
    public void testAddition(){
        Calculation calculation = new Calculation();
        calculation.addition(1, 10);
        int actual = calculation.z;
        assertEquals(11, actual);
    }
    @Test
    public void testSubstraction() {
        //long abc = 10; //proses down casting
        Calculation calculation = new MyCalculation();
        calculation.subsctraction(9, 2);
        int actual = calculation.z;
        assertEquals(7, actual);

    }
    @Test
    public void testMultiplication() {
        MyCalculation mycalculation = new MyCalculation();
        mycalculation.multiplication(1, 10);
        int actual = mycalculation.z;
        assertEquals(10, actual);

    }
}