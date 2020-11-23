package co.g2academy.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayEnhancedLoopTest {
    private ArrayEnhancedLoop array = new ArrayEnhancedLoop();

    @Test
    public void testSumAllItemsInArrayOfInteger() {
        int actual = array.calculateSumOfAllItems();
        assertEquals(30, actual);
    }

    @Test
    public void testMultiplicationAllItemsInArrayOfInteger() {
        int actual = array.calculateMultiplicationOfAllItems();
        assertEquals(2400, actual);
    }

    //average of all items
    @Test
    public void test_average_alL_items_in_array_of_integer() {
        int actual = array.calculateAverageOfAllItems();
        assertEquals(6, actual);
    }
}
//red, green, refactor