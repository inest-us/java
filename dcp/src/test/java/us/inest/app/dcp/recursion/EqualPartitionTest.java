package us.inest.app.dcp.recursion;

import static org.junit.Assert.*;
import org.junit.Test;

public class EqualPartitionTest {
    @Test
    public void testPartition() {
        int[] nums = new int[] { 1, 8, 2, 5 };
        boolean result = EqualPartition.canPartition_DP(nums);
        assertTrue(result);
    }
}
