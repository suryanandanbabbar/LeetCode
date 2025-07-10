package Bit_Manipulation;
// LeetCode Problem: 338. Counting Bits
// Link: https://leetcode.com/problems/counting-bits/

// TC: O(n)
// SC: O(n) 

public class countingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for(int i = 0; i < n + 1; i++) {
            // Even Number -> count(n) : count(n / 2)
            if(i % 2 == 0) ans[i] = ans[i / 2];
            // Odd Number -> count(n) : count(n / 2) + 1
            else ans[i] = ans[i / 2] + 1;
        }

        return ans;
    }
}
