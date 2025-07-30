package Dynamic_Programming;
// LeetCode Problem: 516. Longest Palindromic Subsequence
// Link: https://leetcode.com/problems/longest-palindromic-subsequence/description

// TC: O(n^2)
// SC: O(n^2)

public class longestPalindromicSubsequence {
public int longestPalindromeSubseq(String s) {
        int n = s.length();
        if(n == 0) return 0;
        
        StringBuilder reverse = new StringBuilder(s);
        String rev = reverse.reverse().toString();
        return LCS(s, rev, n, n);
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
