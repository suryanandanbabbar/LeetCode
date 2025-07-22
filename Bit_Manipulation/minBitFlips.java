package Bit_Manipulation;
// LeetCode Problem: 2220. Minimum Bit Flips to Convert Number
// Problem Link: https://leetcode.com/problems/minimum-bit-flips-to-convert-number/

// TC: O(log n)
// SC: O(1)

public class minBitFlips {
    public int minFlips(int start, int goal) {
        // XOR
        int xor = start ^ goal;
        int count = 0;

        while (xor > 0) {
            count += (xor & 1);
            xor >>= 1;
        }

        // return count;

        // Naive Approach
        while(start != 0 || goal != 0) {
            if((start & 1) != (goal & 1)) {
                count++;
            } 
            start >>= 1;
            goal >>= 1;
        }

        return count;

    }
}
