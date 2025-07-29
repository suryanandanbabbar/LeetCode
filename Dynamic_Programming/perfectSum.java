package Dynamic_Programming;
// GfG: Perfect Sum Problem
// Link: https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/1

// TC: O(n * target)
// SC: O(target)

/*
 * Explaining the working of 'for' loops:
 * 
 * 1. for(int i = 0; i <= n; i++) dp[i][0] = 1;
 *   This initializes the first column of the dp array, indicating that there is one way to 
 *   form a sum of 0 with any number of elements (by choosing no elements).
 * 
 * 2. for(int j = 1; j <= target; j++) dp[0][j] = 0;
 *   This initializes the first row of the dp array, indicating that there are no ways to
 *   form a positive sum with zero elements. 
 *   Why 'j = 1'? Because we are only interested in positive sums, and the sum of 0 is already handled in the first column.
 *   How? Because we can always form a sum of 0 by choosing no elements, which is why dp[0][0] is set to 1.
 * 
 * 3. for(int i = 1; i <= n; i++) {
 *   This iterates through each element of the array.
 * 
 * 4. for(int j = 0; j <= target; j++) {
 *   This iterates through all possible sums from 0 to the target.
 * 
 * 5. if(arr[i - 1] <= j)
 *   This checks if the current element can be included in the subset to form the sum j
 * 
 * 6. dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
 *   This updates the dp array by adding the number of ways to form the sum j by including the current element 
 * 
 * 7. else
 *   This means the current element cannot be included in the subset to form the sum j.
 * 
 * 8. dp[i][j] = dp[i - 1][j];
 *   This updates the dp array by carrying forward the number of ways to form the sum j without
 *   including the current element.
 * 
 * 9. return dp[n][target];
 *   This returns the total number of ways to form the target sum using all elements of the array
 */

public class perfectSum {
    public int sum(int[] arr, int target) {
        int n = arr.length;
        int[][] dp = new int[n + 1][target + 1];
       
        for(int i = 0; i <= n; i++) dp[i][0] = 1;
        for(int j = 1; j <= target; j++) dp[0][j] = 0;
       
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= target; j++) {
                if(arr[i - 1] <= j) 
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                else 
                    dp[i][j] = dp[i - 1][j];
                
            }
        }
        return dp[n][target];
    }
    
}
