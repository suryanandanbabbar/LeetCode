// LeetCode Problem: 2958. Length of Longest Subarray with at most K Frequency
// Link: https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency

import java.util.HashMap;

class longestSubarrayKFreq {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0, right = 0, result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.get(nums[right]) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }

            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;
    }
}