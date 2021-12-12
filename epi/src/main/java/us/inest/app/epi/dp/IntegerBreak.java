package us.inest.app.epi.dp;

public class IntegerBreak {

    public static int integerBreak(int n) {
        int[] memo = new int[n + 1];
        memo[1] = 1;
        return integerBreak_memo(n, n, memo);
    }

    public static int integerBreakV2(int n) {
        int[] memo = new int[n + 1];
        memo[1] = 1;
        return integerBreak_dp(n, memo);
    }

    private static int integerBreak_dp(int n, int[] memo) {
        for (int num = 2; num <= n; num++) {
            // build result for num
            memo[num] = num == n ? 0 : num;
            for (int i = 1; i < num; i++) {
                int val = memo[i] * memo[num - i];
                memo[num] = Math.max(memo[num], val);
            }
        }
        return memo[n];
    }

    private static int integerBreak_memo(int n, int currentNum, int[] memo) {
        // base case
        if (memo[currentNum] != 0) {
            return memo[currentNum];
        }

        // init memo[currentNum]
        memo[currentNum] = currentNum == n ? 0 : currentNum;
        for (int i = 1; i < currentNum; i++) {
            int val = integerBreak_memo(n, i, memo) * integerBreak_memo(n, currentNum - i, memo);
            memo[currentNum] = Math.max(memo[currentNum], val);
        }
        return memo[currentNum];
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(2)); // 1
        System.out.println(integerBreak(4)); // 4
        System.out.println("-----------------------------------------------");
        System.out.println(integerBreakV2(2)); // 1
        System.out.println(integerBreakV2(4)); // 4

    }

}
