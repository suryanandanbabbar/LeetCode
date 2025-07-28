package Dynamic_Programming;
// LeetCode Problem: 213. House Robber II
// Link: https://leetcode.com/problems/house-robber-ii/description/

// TC: O(n)
// SC: O(n)

public class houseRobberII {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);

        return Math.max(solve(0, n - 2, nums), solve(1, n - 1, nums));
    }

    private int solve(int start, int end, int[] nums) {
        int n = end - start + 1;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];

        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[start + i] + dp[i - 2]);
        }

        return dp[n - 1];
    }
}
