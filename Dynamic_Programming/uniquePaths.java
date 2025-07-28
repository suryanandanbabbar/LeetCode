package Dynamic_Programming;
// LeetCode Problem: 62. Unique Paths
// Link: https://leetcode.com/problems/unique-paths/description/

// TC: O(m * n)
// SC: O(m * n)

class uniquePaths {
    public int unique(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(0, 0, m, n, dp);
    }

    private int solve(int i, int j, int m, int n, int[][] dp) {
        if (i == m - 1 && j == n - 1)
            return 1;
        if (i >= m || j >= n)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];

        return dp[i][j] = solve(i + 1, j, m, n, dp) + solve(i, j + 1, m, n, dp);
    }
}