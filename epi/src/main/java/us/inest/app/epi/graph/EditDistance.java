package us.inest.app.epi.graph;

public class EditDistance {
    public static int minDistance(String word1, String word2) {
        int rows = word1.length();
        int cols = word2.length();
        int[][] dp = new int[rows + 1][cols + 1];
        
        // fill the last row
        for (int j = 0; j <= cols; j++) {
            dp[rows][j] = cols - j;
        }
        
        // fill the last column
        for (int i = 0; i <= rows; i++) {
            dp[i][cols] = rows - i;
        }
        
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1];
                } else {
                    int min = dp[i + 1][j];
                    if (min > dp[i][j + 1]) min = dp[i][j + 1];
                    if (min > dp[i + 1][j + 1]) min = dp[i + 1][j + 1];
                    dp[i][j] = 1 + min;
                }
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        int result = minDistance("abd", "acd"); // 1
        System.out.println(result);
    }

}
