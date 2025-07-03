// LeetCode Problem: 209. Minimum Size Subarray Sum
// Link: https://leetcode.com/problems/minimum-size-subarray-sum/

class minSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        while (right < n) {
            sum += nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
