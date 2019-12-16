package us.inest.app.epi.arrays;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class CanReachEndTest {
    @Test
    public void testCanReachEnd() {
        Integer[] arr = new Integer[] { 3, 3, 1, 0, 2, 0, 1 };
        List<Integer> list = Arrays.asList(arr);

        boolean result = CanReachEnd.canReachEnd(list);
        assertTrue(result);
    }
}
