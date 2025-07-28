package Dynamic_Programming;
// LeetCode Problem: 64. Minimum Path Sum
// Link: https://leetcode.com/problems/minimum-path-sum/description/

// TC: O(m * n)
// SC: O(1)

public class minimumPathSum {
    // Tabulation approach
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        return grid[m - 1][n - 1];
    }

    // Recursive Approach
    public int minPathSumRec(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return solve(0,0,m,n,grid);
    }

    private int solve(int i, int j, int m, int n, int[][] grid) {
        if(i == m - 1 && j == n - 1) return grid[i][j];
        if(i >= m || j >= n) return Integer.MAX_VALUE;

        return grid[i][j] + Math.min(solve(i + 1, j, m, n, grid), solve(i, j + 1, m, n, grid));
    }
}
