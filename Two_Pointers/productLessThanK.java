package Two_Pointers;
// LeetCode Problem: 713. Subarray Product Less Than K
// Link: https://leetcode.com/problems/subarray-product-less-than-k/

// TC: O(n)
// SC: O(1)

class productLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; 

        int left = 0, right = 0, product = 1, count = 0;

        while (right < nums.length) {
            product *= nums[right];

            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }

            count += right - left + 1; 
            right++;
        }

        return count;
    }
}
