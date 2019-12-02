package us.inest.app.epi.sorting;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SmallestNonconstructibleValueTest {
    @Test
    public void testSmallestNonconstructibleValueTest() {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(12, 2, 1, 15, 2, 4));
        int result = SmallestNonconstructibleValue.smallestNonconstructibleValue(arr);
        assertEquals(10, result);
    }
}
