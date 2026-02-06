// LeetCode Problem: 3634. Minimum Removals to Balance an Array
// Link: https://leetcode.com/problems/minimum-removals-to-balance-array/

// TC: O(n)
// SC: O(1)
package Arrays;

import java.util.Arrays;

/*
You are given an integer array nums and an integer k.
An array is considered balanced if the value of its maximum element is at most k times the minimum element.

You may remove any number of elements from nums​​​​​​​ without making it empty.

Return the minimum number of elements to remove so that the remaining array is balanced.

Note: An array of size 1 is considered balanced as its maximum and minimum are equal, and the condition always holds true.
*/

public class minRemovalBalanceArray {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums); 
        if (n == 1)
            return 0;

        int count = 0;
        for (int i = 0, j = 0; i < n; i++) {
            while (j + 1 < n && (long) nums[i] * (long) k >= nums[j + 1]) {
                j++;
            }
            count = Math.max(count, j - i + 1);
        }

        return n - count;
    }
}
