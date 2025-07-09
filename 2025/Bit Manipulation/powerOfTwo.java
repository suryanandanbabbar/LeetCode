// LeetCode Problem: 231. Power of Two
// Link: https://leetcode.com/problems/power-of-two/

// TC: O(1)
// SC: O(1)


/*
 * If a number is a power of two, it has only one bit set in its binary representation.
 * For example:
 * 1 (2^0) -> 0001
 * 2 (2^1) -> 0010
 * 4 (2^2) -> 0100
 * 
 * Also, a number n is a power of two if n > 0 and (n & (n - 1)) == 0.
 * Example: n = 8
 * 8 (2^3) -> 1000
 * 8 - 1 = 7 -> 0111
 * 8 & 7 = 1000 & 0111 = 0000   
 * Thus, 8 is a power of two.
 */
public class powerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        
        int result = n & (n - 1);
        if(result == 0) return true;
        else return false;
    }
}
