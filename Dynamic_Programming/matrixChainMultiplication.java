package Dynamic_Programming;
// GfG: Matrix Chain Multiplication
// Link: https://www.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1

// TC: O(n^3)
// SC: O(n^2)

import java.util.Arrays;

public class matrixChainMultiplication {
    static int[][] dp;
    
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        dp = new int[n][n];
        
        for(int[] row: dp) 
            Arrays.fill(row, -1);
            
        return solve(arr, 1, n - 1);
    }
    
    static int solve(int[] arr, int i, int j) {
        if(i >= j) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int min = Integer.MAX_VALUE;
        for(int k = i; k < j; k++) {
            int left = solve(arr, i, k);
            int right = solve(arr, k + 1, j);
            int cost = arr[i - 1] * arr[j] * arr[k];
            
            int total = left + right + cost;
            min = Math.min(total, min);
        }
        
        dp[i][j] = min;
        return dp[i][j];
    }
}
