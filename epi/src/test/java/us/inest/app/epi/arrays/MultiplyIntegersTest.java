package us.inest.app.epi.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MultiplyIntegersTest {
    @Test
    public void testMultiply() {
        List<Integer> num1 = new ArrayList<>(Arrays.asList(new Integer[] {1, 2}));
        List<Integer> num2 = new ArrayList<>(Arrays.asList(new Integer[] {1, 5}));
        List<Integer> result = MultiplyIntegers.multiply(num1, num2);
        assertEquals(0, (int) result.get(2));
        assertEquals(8, (int) result.get(1));
        assertEquals(1, (int) result.get(0));
    }
    
    @Test
    public void testMultiply_2() {
        List<Integer> num1 = new ArrayList<>(Arrays.asList(new Integer[] {-1, 2}));
        List<Integer> num2 = new ArrayList<>(Arrays.asList(new Integer[] {1, 5}));
        List<Integer> result = MultiplyIntegers.multiply(num1, num2);
        assertEquals(0, (int) result.get(2));
        assertEquals(8, (int) result.get(1));
        assertEquals(-1, (int) result.get(0));
    }
}
