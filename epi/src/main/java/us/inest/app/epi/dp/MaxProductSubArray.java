package us.inest.app.epi.dp;

public class MaxProductSubArray {

    public static int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        int currentMin = 1;
        int currentMax = 1;

        for (int num : nums) {
            // handle the case num is 0
            if (num == 0) {
                currentMin = 1;
                currentMax = 1;
                continue;
            }
            int tmp = currentMax * num;
            currentMax = max(currentMax * num, currentMin * num, num);
            currentMin = min(tmp, currentMin * num, num);
            result = Math.max(currentMax, currentMin);
        }
        return result;
    }

    private static int max(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }

    private static int min(int a, int b, int c) {
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] { -1, -2, -3 })); // 6

    }

}
