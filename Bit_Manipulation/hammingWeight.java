package Bit_Manipulation;
// LeetCode Problem: 191. Number of 1 Bits
// Link: https://leetcode.com/problems/number-of-1-bits/

// TC: O(log n)
// SC: O(1)

public class hammingWeight {
    public int setBits(int n) {
        // Naive Approach
        // TC: O(log n)
        // SC: O(1)
        // int temp = n;
        // int count2 = 0;
        // while (temp != 0) {
        //     if ((temp & 1) == 1)
        //         count2++;
        //     temp = temp >> 1;
        // }

        // Brian Kernighan's Algorithm
        // TC: O(log n), where k is the number of set bits in n
        // SC: O(1)
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
