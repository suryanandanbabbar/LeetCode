// LeetCode Problem 1004: Max Consecutive Ones III
// Link: https://leetcode.com/problems/max-consecutive-ones-iii/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, result = 0;
        int count = 0;

        while(right < nums.length) {
            if(nums[right] == 0) {
                count++;
            } 
            while(count > k) {
                if(nums[left] == 0) {
                    count--;
                } 
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }    
}
