package Bit_Manipulation;
// LeetCode Problem: 1545. Find Kth Bit in Nth Binary String
// Link: https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/

// TC: O(n * k)
// SC: O(n)

class kthBitNthBinaryString {
    public char findKthBit(int n, int k) {
        if (n == 1) return '0';
        
        int len = (1 << n) - 1;
        int mid = (len + 1) / 2;
        
        if (k == mid) return '1';
        if (k < mid) return findKthBit(n - 1, k);
        
        char c = findKthBit(n - 1, len - k + 1);
        return c == '0' ? '1' : '0';
    }
}