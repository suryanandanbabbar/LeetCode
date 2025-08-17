package Dynamic_Programming;
// LeetCode Problem: 837. New 21 Game
// Link: https://leetcode.com/problems/new-21-game/description/

// TC: O(n)
// SC: O(n)

public class new21Game {
    public double newGame(int n, int k, int maxPts) {
        if (k == 0 || n >= k + maxPts) return 1.0;

        double[] dp = new double[n + 1];
        dp[0] = 1.0;

        double sum = 1.0;
        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            dp[i] = sum / maxPts;

            if (i < k) sum += dp[i];
            else result += dp[i];
        
            if (i - maxPts >= 0) sum -= dp[i - maxPts]; 
        }
        return result;
    }
}
