package Bit_Manipulation;
// GfG: Check Kth Bit Set or Not
// Link: https://www.geeksforgeeks.org/check-kth-bit-set-not/

// TC: O(1)
// SC: O(1)

/*
 * To check if the kth bit of a number n is set (1) or not (0), we can use the bitwise AND operator (&).
 * We can create a mask by left-shifting 1 by k positions (1 << k) and then perform a bitwise AND operation with n.
 * If the result is greater than 0, it means the kth bit is set; otherwise, it is not set.
 * 
 * For example:
 * n = 5 (binary: 0101)
 * k = 2
 * Mask = 1 << 2 = 4 (binary: 0100)
 * Result = n & Mask = 5 & 4 = 4 (binary: 0100)
 * Since the result is greater than 0, the 2nd bit of n is set.
 */

public class checkKthBitSol {
    static boolean checkKthBit(int n, int k) {
        int result = n & (1 << k);
        if(result > 0) return true;
        return false;
    }
}

