package us.inest.app.epi.dp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountSetsTest {
    @Test
    public void testcountSets() {
        int[] arr = new int[] {2, 4, 6, 10};
        int total = 16;
        int result = CountSets.countSets(arr, total);
        assertEquals(2, result);
    }
    
    @Test
    public void testcountSetsV2() {
        int[] arr = new int[] {2, 4, 6, 10};
        int total = 16;
        int result = CountSets.countSetsV2(arr, total);
        assertEquals(2, result);
    }
}
