package Dynamic_Programming;
// LeetCode Problem: 1143. Longest Common Subsequence
// Link: https://leetcode.com/problems/longest-common-subsequence/description/

// TC: O(n * m)
// SC: O(n * m)

public class longestCommonSubsequence {
    public int subsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        if(n == 0 || m == 0) return 0;

        return LCS(text1, text2, n, m);
    }

    private int LCS(String x, String y, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= m; j++) {
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else if(x.charAt(i - 1) == y.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else 
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[n][m];
    }
    
}
