package us.inest.app.epi.dp;

import java.util.Arrays;

public class Knapsack {
    public static int KS(int C, int[] w, int[] v) {
        // w[0] and v[0] are the dummy values
        return KS_Recursive(w.length - 1, C, w, v);
    }
    
    public static int KS_V2(int C, int[] w, int[] v) {
        // w[0] and v[0] are the dummy values
        int[][] memo = new int[w.length][C + 1];
        Arrays.fill(memo, -1);
        return KS_memo(w.length - 1, C, w, v, memo);
    }

    private static int KS_Recursive(int index, int C, int[] w, int[] v) {
        int result;
        // base case
        if (index == 0 || C == 0) {
            result = 0;
        } else if (w[index] > C) {
            // can not choose this item
            result = KS_Recursive(index - 1, C, w, v);
        } else {
            int result1 = KS_Recursive(index - 1, C, w, v); // Do not choose this item
            int result2 = v[index] + KS_Recursive(index - 1, C - w[index], w, v); // Choose this item
            result = Math.max(result1, result2);
        }
        return result;
    }

    private static int KS_memo(int index, int C, int[] w, int[] v, int[][] memo) {
        if (memo[index][C] != -1) {
            return memo[index][C];
        }
        int result;
        // base case
        if (index == 0 || C == 0) {
            result = 0;
        } else if (w[index] > C) {
            // can not choose this item
            result = KS_memo(index - 1, C, w, v, memo);
        } else {
            int result1 = KS_memo(index - 1, C, w, v, memo); // Do not choose this item
            int result2 = v[index] + KS_memo(index - 1, C - w[index], w, v, memo); // Choose this item
            result = Math.max(result1, result2);
        }
        memo[index][C] = result;
        return result;
    }
}
