package Dynamic_Programming;
// LeetCode Problem: 120. Triangle
// Link: https://leetcode.com/problems/triangle/

// TC: O(n^2)
// SC: O(n)

/*
 * Explanation:
 * 
 * 1. for(int i = 0; i < n; i++) dp[i] = triangle.get(n - 1).get(i);
 * This initializes the last row of dp to the last row of triangle.
 * Why? Because we will be calculating from bottom to top.
 * Why Bottom to Top? Because we want to use the results of the next row to calculate the current row.
 * 
 * 2. for(int i = n - 2; i >= 0; i--) {
 * This iterates from the second last row to the top row.
 * 
 * 3. for(int j = 0; j <= i; j++) {
 * This iterates through each element in the current row.
 * 
 * 4. dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
 * This updates the dp array by adding the current element of the triangle to the minimum of the
 * two elements directly below it in the dp array.
 * Why? Because we want to find the minimum path sum from the top to the bottom of the triangle.
 * 
 * 5. return dp[0];
 * This returns the top element of the dp array, which contains the minimum path sum from the
 * top to the bottom of the triangle.
 */

import java.util.List;
public class triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if(n == 0) return 0;
        if(n == 1) return triangle.get(0).get(0);

        int[] dp = new int[n];

        // Initialize the last row of dp to the last row of triangle
        // Because we will be calculating from bottom to top
        // Why Bottom to Top? 
        // Because we want to use the results of the next row to calculate the current row
        for(int i = 0; i < n; i++) dp[i] = triangle.get(n - 1).get(i);

        for(int i = n - 2; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }

        return dp[0]; // The top element will have the minimum path sum
    }
    
}
