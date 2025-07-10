package Bit_Manipulation;
// LeetCode Problem: 136. Single Number
// Problem Link: https://leetcode.com/problems/single-number/

// TC: O(n)
// SC: O(1)

public class singleNumber {
   public static int singleNum(int[] nums) {
        int result = 0;
        
        for(int num : nums) {
            result ^= num;
        }
        
        return result;
    } 
}
