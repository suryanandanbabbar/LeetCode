package Bit_Manipulation;
// GfG: Set the Rightmost Unset Bit
// Link: https://www.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1

// TC: O(1)
// SC: O(1)

/*
 * Example: n = 10 (binary: 1010)
 * The rightmost unset bit is at position 1 (0-indexed).
 * To set this bit, we can use the formula n | (n + 1).
 * n + 1 = 11 (binary: 1011)
 * n | (n + 1) = 10 | 11 = 11 (binary: 1011)
 * Thus, the result is 11.
 */

public class setRightmostUnset {
    static int setBit(int n) {
        int x = n | (n + 1);
        return x;
    }
}
