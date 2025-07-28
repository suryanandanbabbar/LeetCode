package Dynamic_Programming;
// LeetCode Problem: 70. Climbing Stairs
// Link: https://leetcode.com/problems/climbing-stairs/

// TC: O(n)
// SC: O(n)

public class climbStairs {
    public int climb(int n) {
        if (n <= 2) return n;
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}
