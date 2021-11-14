package us.inest.app.epi.dp;

import java.util.Arrays;

public class CountBits {
    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 0);
        int offset = 1;
        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i) {
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }

        return dp;
    }

    public static void main(String[] args) {
        int[] dp = countBits(8);
        System.out.println("done");
    }
}
