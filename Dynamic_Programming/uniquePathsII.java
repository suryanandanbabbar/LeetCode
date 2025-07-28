package Dynamic_Programming;
// LeetCode Problem: 63. Unique Paths II
// Link: https://leetcode.com/problems/unique-paths-ii/description/

// TC: O(m * n)
// SC: O(m * n)

public class uniquePathsII {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++) for(int j = 0; j < m; j++) dp[i][j] = -1;

        return solve(0, 0, n, m, dp, grid);
    }

    private int solve(int i, int j, int n, int m, int[][] dp, int[][] grid) {
        if(i >= n || j >= m || grid[i][j] == 1 || i < 0 || j < 0) return 0;
        if(i == n - 1 && j == m - 1) return 1;
        if(dp[i][j] != -1) return dp[i][j];

        return dp[i][j] = solve(i + 1, j, n, m, dp, grid) + solve(i, j + 1, n, m, dp, grid);
    }
}
