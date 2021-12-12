package us.inest.app.epi.dp;

public class WordBreak {
    public static boolean wordBreak(String s, String[] wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (String w : wordDict) {
                if (i + w.length() <= s.length()) {
                    String subStr = s.substring(i, i + w.length());
                    if (subStr.equals(w)) {
                        dp[i] = dp[i + w.length()];
                    }
                }
                if (dp[i] == true) break;
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        System.out.println(wordBreak("leetcode", new String[] {"leet", "code"})); // true
        System.out.println(wordBreak("leetcode", new String[] {"neet", "code"})); // false
    }

}
