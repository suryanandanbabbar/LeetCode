package Bit_Manipulation;
// LeetCode Problem: 342. Power of Four
// Link: https://leetcode.com/problems/power-of-four/

// TC: O(1)
// SC: O(1)

/*
 * Explanation:
 * Firstly, a number is a power of four if it is a power of two.
 * That is, it has only one bit set in its binary representation.
 * We can check this using the expression (n & (n - 1)) == 0.
 * 
 * Secondly, for a number to be a power of four, it must also satisfy the condition
 * that it is congruent to 1 modulo 3. This is because powers of four
 * (1, 4, 16, 64, ...) when divided by 3 yield a remainder of 1.
 * We can check this using the expression n % 3 == 1.
 */

public class powerOfFour {
    public boolean isPowerOfFour(int n) {
        return (n & (n - 1)) == 0 && n % 3 == 1;
    }
}
