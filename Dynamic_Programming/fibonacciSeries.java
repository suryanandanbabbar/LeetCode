package Dynamic_Programming;
// LeetCode Problem: 509. Fibonacci Number
// Link: https://leetcode.com/problems/fibonacci-number/description/

// TC: O(n)
// SC: O(n)

class fibonacciSeries {
    public int fib(int n) {
        int[] dp = new int[n + 1];
        if(n == 0 || n == 1) return n;
        if(dp[n] == -1) return dp[n];
        return dp[n] = fib(n - 1) + fib(n - 2);
    }
}