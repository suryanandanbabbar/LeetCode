package Dynamic_Programming;
// GfG: Subset Sum Problem
// Link: https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1

// TC: O(n * sum)
// SC: O(n * sum)

public class subsetSum {
    // Tabulation Approach
    public static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) dp[i][0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[n][sum];
    }
}
