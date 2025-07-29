package Bit_Manipulation;
// LeetCode Problem: 485. Max Consecutive Ones
// Problem Link: https://leetcode.com/problems/max-consecutive-ones/

// TC: O(n)
// SC: O(1)

public class maxConsOnes {
    public static int maxConsecutiveOnes(int n) {
        int result = 0;

        while(n > 0) {
            int count = 0;
            while((n & 1) == 1) {
                count++;
                n >>= 1;
            }
            result = Math.max(result, count);
            n >>= 1; 
        }
                
        return result;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;      
        for(int num : nums) {
            if(num == 1) {
                count++;
            } else {
                result = Math.max(result, count);
                count = 0;
            }
        }
        result = Math.max(result, count); 
        return result;
    }
}
