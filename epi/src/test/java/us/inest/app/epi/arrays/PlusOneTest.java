package us.inest.app.epi.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlusOneTest {
    @Test
    public void testPlusOne() {
        List<Integer> number = new ArrayList<>(Arrays.asList(new Integer[] {3, 6, 7}));
        List<Integer> result = PlusOne.plusOne(number);
        assertEquals(8, (int) result.get(2));
        assertEquals(6, (int) result.get(1));
        assertEquals(3, (int) result.get(0));
    }
    
    @Test
    public void testPlusOne_2() {
        List<Integer> number =  new ArrayList<>(Arrays.asList(new Integer[] {9, 9, 9}));
        List<Integer> result = PlusOne.plusOne(number);
        assertEquals(0, (int) result.get(3));
        assertEquals(0, (int) result.get(2));
        assertEquals(0, (int) result.get(1));
        assertEquals(1, (int) result.get(0));
    }
}
