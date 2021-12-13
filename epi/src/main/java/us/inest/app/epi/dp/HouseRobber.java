package us.inest.app.epi.dp;

public class HouseRobber {

    public static int rob(int[] nums) {
        int[] memo = new int[nums.length];
        return rob_memo(nums, 0, memo);
    }

    public static int rob_dp(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;
        for (int num : nums) {
            int tmp = rob2;
            rob2 = Math.max(rob2, num + rob1);
            rob1 = tmp;
        }
        return rob2;
    }

    private static int rob_memo(int[] nums, int index, int[] memo) {
        // base case
        if (index >= nums.length) {
            return 0;
        }

        if (memo[index] != 0) {
            return memo[index];
        }

        memo[index] = Math.max(nums[index] + rob_memo(nums, index + 2, memo), rob_memo(nums, index + 1, memo));
        return memo[index];
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[] { 1, 2, 3, 1 })); // 4
        System.out.println(rob(new int[] { 2, 7, 9, 3, 1 })); // 12
        System.out.println("------------------------------------------------");
        System.out.println(rob(new int[] { 1, 2, 3, 1 })); // 4
        System.out.println(rob(new int[] { 2, 7, 9, 3, 1 })); // 12
    }

}
