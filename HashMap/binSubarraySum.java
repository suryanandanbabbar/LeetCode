package HashMap;
// LeetCode Problem: 930. Binary Subarrays With Sum
// Link: https://leetcode.com/problems/binary-subarrays-with-sum/

// TC: O(n)
// SC: O(n)

import java.util.HashMap;

class binarySubarrays {
    public int numSubarraysWithSum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;

        map.put(0, 1); 

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}