package Dynamic_Programming;
// GfG: 0/1 Knapsack Problem
// Link: https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

// TC: O(n * W)
// SC: O(n * W) 

public class knapsack01 {
    // Recursive Approach (Gives TLE)
    // TC: O(2^n)
    // SC: O(n)
    public int knapsackTLE(int[] wt, int[] val, int W) {
        int n = wt.length;
        return solveTLE(wt, val, W, n);
    }

    private int solveTLE(int[] wt, int[] val, int W, int n) {
        if (W == 0 || n == 0)
            return 0;
        if (wt[n - 1] <= W)
            return Math.max(val[n - 1] + solveTLE(wt, val, W - wt[n - 1], n - 1), solveTLE(wt, val, W, n - 1));
        else
            return solveTLE(wt, val, W, n - 1);
    }

    // Memoization Approach
    // TC: O(n * W)
    // SC: O(n * W)
    public int knapsackMemo(int[] wt, int[] val, int W) {
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int[] row : dp) {
            for (int j = 0; j < row.length; j++) {
                row[j] = -1;
            }
        }

        return solveMemo(wt, val, W, n, dp);
    }

    private int solveMemo(int[] wt, int[] val, int W, int n, int[][] dp) {
        if (W == 0 || n == 0)
            return 0;
        if (dp[n][W] != -1)
            return dp[n][W];

        if (wt[n - 1] <= W) {
            dp[n][W] = Math.max(val[n - 1] + solveMemo(wt, val, W - wt[n - 1], n - 1, dp),
                    solveMemo(wt, val, W, n - 1, dp));
        } else {
            dp[n][W] = solveMemo(wt, val, W, n - 1, dp);
        }
        return dp[n][W];
    }

    // Tablulation Approach
    // TC: O(n * W)
    // SC: O(n * W)
    public int knapsackTab(int[] wt, int[] val, int W) {
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= W; j++) {
                if(i == 0 || j == 0) 
                    dp[i][j] = 0;
                else if(wt[i - 1] <= j) 
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                else 
                    dp[i][j] = dp[i - 1][j];
                
            }
        }
        return dp[n][W];
    }
}
