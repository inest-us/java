package us.inest.app.epi.arrays;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int curSum = 0;

        for (int n : nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += n;
            maxSub = Math.max(maxSub, curSum);
        }
        return maxSub;
    }

    /*
     * Kadane's Algorithm
     */
    public static int maxSubArrayV2(int[] nums) {
        int maxGlobal = nums[0];
        int maxCurrent = nums[0];

        for (int i = 0; i < nums.length; i++) {
            maxCurrent = Math.max(maxCurrent + nums[i], nums[i]);
            maxGlobal = Math.max(maxCurrent, maxGlobal);
        }
        return maxGlobal;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 })); // 6
        System.out.println(maxSubArrayV2(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 })); // 6
    }

}
