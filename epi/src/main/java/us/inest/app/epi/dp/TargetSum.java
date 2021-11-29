package us.inest.app.epi.dp;

import java.util.*;

public class TargetSum {

    public static int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> memo = new HashMap<>();
        return backtrack(nums, 0, 0, target, memo);
    }

    private static int backtrack(int[] nums, int index, int total, int target, Map<String, Integer> memo) {
        // base case
        if (index == nums.length) {
            return target == total ? 1 : 0;
        }

        String key = String.valueOf(index) + "," + String.valueOf(total);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int result = backtrack(nums, index + 1, total + nums[index], target, memo)
                + backtrack(nums, index + 1, total - nums[index], target, memo);
        memo.put(key, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[] {1, 1, 1, 1, 1}, 3)); // 5

    }

}
