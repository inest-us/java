package us.inest.app.epi.arrays;

public class MinRotatedArray {
    
    public static int findMin(int[] nums) {
        int result = nums[0];
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] < nums[r]) {
                // this part is sorted
                result = Math.min(result, nums[l]);
                return result;
            }
            int m = (l + r) / 2;
            result = Math.min(result, nums[m]);
            if (nums[m] >= nums[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = findMin(new int[] {3, 4, 5, 1, 2}); // 1
        System.out.println(result);
    }

}
