package us.inest.app.epi.arrays;

public class MaxScore {
    public static int maxScore(int[] cardPoints, int k) {
        if (cardPoints.length < k) {
            return -1; // invalid input
        }
        int left = 0;
        int right = cardPoints.length - k;
        int sum = 0;
        int result = 0;
        for (int j = cardPoints.length - 1; j >= right; j--) {
            sum += cardPoints[j];
        }
        result = sum;
        for (int j = right; j < cardPoints.length; j++) {
            sum = sum - cardPoints[j] + cardPoints[left];
            left++;
            result = Math.max(result, sum);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxScore(new int[] { 1, 2, 3, 4, 5, 6, 1 }, 3)); // 12
    }
}
