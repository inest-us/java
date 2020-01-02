package us.inest.app.dcp.dp;

import org.junit.Test;
import static org.junit.Assert.*;

public class UniqueWaysToMakeChangeTest {
    @Test
    public void testUniqueWaysToMakeChange() {
        int amount = 5;
        int[] coins = new int[] { 1, 2, 5 };

        int result = UniqueWaysToMakeChange.uniqueWaysToMakeChange(amount, coins);
        assertEquals(4, result);
    }
}
