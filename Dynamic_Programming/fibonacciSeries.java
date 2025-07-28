package Dynamic_Programming;
// LeetCode Problem: 509. Fibonacci Number
// Link: https://leetcode.com/problems/fibonacci-number/description/

// TC: O(n)
// SC: O(n)

class fibonacciSeries {
    // Memoization approach
    public int fib(int n) {
        int[] dp = new int[n + 1];
        if(n == 0 || n == 1) return n;
        if(dp[n] == -1) return dp[n];
        return dp[n] = fib(n - 1) + fib(n - 2);
    }

    // Tabulation approach
    public int fibTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}