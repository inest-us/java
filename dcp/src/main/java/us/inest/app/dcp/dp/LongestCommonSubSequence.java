package us.inest.app.dcp.dp;

public class LongestCommonSubSequence {
    /*
     * naive recursive implementation
     */
    public static int LCS(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) {
            return 0;
        }
        if (s1.charAt(s1.length() -1) == s2.charAt(s2.length() - 1)) {
            return 1 + LCS(s1.substring(0, s1.length() - 1), s2.substring(0, s2.length() - 1));
        } else {
            return Math.max(LCS(s1.substring(0, s1.length() - 1), s2), LCS(s1, s2.substring(0, s2.length() - 1)));
        }
    }
    
    /*
     * using Dynamic programming
     */
    public static int LCS_DP(String s1, String s2) {
        int[][] matrix = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 0;
                } else {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        matrix[i][j] = 1 + matrix[i - 1][j - 1];
                    } else {
                        matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
                    }
                }
            }
        }
        return matrix[s1.length()][s2.length()];
    }
}
