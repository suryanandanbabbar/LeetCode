package Dynamic_Programming;
// LeetCode Problem: 1137. N-th Tribonacci Number
// Link: https://leetcode.com/problems/n-th-tribonacci-number/

// TC: O(n)
// SC: O(n)

public class tribonacciSeries {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i = 3; i <= n; i++) 
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        
        return dp[n];
    }
}
