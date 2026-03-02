package Bit_Manipulation;
// LeetCode Problem: 137. Single Number II
// Link: https://leetcode.com/problems/single-number-ii/

// TC: O(n)
// SC: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;

        for (final int num : nums) {
            // "ones" tracks bits appearing 1st time (modulo 3)
            ones ^= (num & ~twos);
            // "twos" tracks bits appearing 2nd time (modulo 3)
            twos ^= (num & ~ones);
        }

        return ones;
    }
}