package Arrays;
// LeetCode Problem: 2348. Number of Zero-Filled Subarrays
// Link: https://leetcode.com/problems/number-of-zero-filled-subarrays/

// TC: O(n)
// SC: O(1)

public class noOfZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        long temp = 0;

        for(int n: nums) {
            temp = (n == 0) ? temp + 1 : 0;
            result += temp;
        }

        return result;
    }
}
