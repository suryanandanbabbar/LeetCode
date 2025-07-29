package Dynamic_Programming;
// LeetCode Problem: 416. Partition Equal Subset Sum
// Link: https://leetcode.com/problems/partition-equal-subset-sum/

// TC: O(n * sum)
// SC: O(n * sum)

/*
 * Calculate the total sum of the array.
 * If the sum is odd, return false.
 * Because if sum is odd, we cannot partition it into two equal subsets.
 * If the sum is even, we need to check if there exists a subset with sum equal to sum / 2.
 * We can use a dynamic programming approach to solve this problem.
 * 
 * We create a 2D boolean array dp where dp[i][j] indicates whether a subset with sum j can be formed using the first i elements of the array.
 * We initialize the first column to true (sum 0 can always be formed with an empty
 * subset) and the first row to false (no elements means no positive sum can be formed).
 * We then iterate through the array and fill the dp array based on whether we can include the
 * current element or not.
 * 
 * If we can form a subset with sum equal to sum / 2, we return true.
 * Otherwise, we return false.
 * 
 * If you carefully observe, this problem is similar to the Subset Sum Problem.
 */

public class partitionEqualSubsets {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i: nums) sum += i;

        if(sum % 2 != 0) return false;
        return solve(nums, sum / 2);
    }

    private boolean solve(int[] nums, int sum) {
        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for(int i = 0; i <= n; i++) dp[i][0] = true;
        for(int i = 0; i <= sum; i++) dp[0][i] = false;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sum; j++) {
                if(nums[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
                else 
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[n][sum];
    }
}
