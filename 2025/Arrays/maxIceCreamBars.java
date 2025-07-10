package Arrays;
// LeetCode Problem: 1833. Maximum Ice Cream Bars
// Link: https://leetcode.com/problems/maximum-ice-cream-bars/description/

// TC: O(n log n)
// SC: O(1)

import java.util.Arrays;

public class maxIceCreamBars {

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int result = 0;

        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= coins) {
                coins -= costs[i];  
                result++;
            } else {
                break; 
            }
        }

        return result;
    }
}
