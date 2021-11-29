package us.inest.app.epi.dp;

import java.util.*;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        for (int a = 1; a <= amount; a++) {
            for (int coin : coins) {
                if (a - coin >= 0) {
                    memo[a] = Math.min(memo[a], 1 + memo[a - coin]);
                }
            }
        }
        return (memo[amount] != Integer.MAX_VALUE ? memo[amount] : -1);
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[] { 1, 3, 4, 5 }, 7)); // 2
    }

}
