package us.inest.app.dcp.dp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoinChangeTest {
    @Test
    public void testCoinChange() {
        int[] coins = new int[] { 1, 2, 5 };
        int amount = 11;
        int count = CoinChange.coinChange(coins, amount);
        int expected = 3;
        assertEquals(expected, count);
    }
}
