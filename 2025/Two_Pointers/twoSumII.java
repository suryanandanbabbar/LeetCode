package Two_Pointers;
// LeetCode Problem: 167. Two Sum II - Input array is sorted
// Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

// TC: O(n)
// SC: O(1)

public class twoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int sum = numbers[left] + numbers[right];

            if(sum == target) return new int[]{left + 1, right + 1};
            else if(sum < target) left++;
            else right--;
        }

        return new int[]{left + 1, right + 1};
        
    }
}
