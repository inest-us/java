package us.inest.app.epi.dp;

import java.util.*;

public class CanPartition {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        Set<Integer> dp = new HashSet<>();
        dp.add(0); // empty set
        for (int i = nums.length - 1; i >= 0; i--) {
            Set<Integer> nextDp = new HashSet<>();
            for (int t : dp) {
                if (t + nums[i] == target) {
                    return true;
                }
                nextDp.add(t + nums[i]);
                nextDp.add(t);
            }
            dp = nextDp;
        }
        
        return dp.contains(target);
    }

    public static void main(String[] args) {
        System.out.println(canPartition(new int[] {1, 5, 11, 5})); // true
        System.out.println(canPartition(new int[] {2, 4, 7})); // false
    }

}
