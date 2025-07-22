package Bit_Manipulation;
// GfG: Bit Manipulation
// Link: https://www.geeksforgeeks.org/problems/bit-manipulation-1666686020/1

// TC: O(1)
// SC: O(1)

/*
 * For get:
 * To get the ith bit of a number, we can right shift the number by (i - 1) positions and then perform a bitwise AND operation with 1.
 * Example:
 * num = 5 (binary: 0101)
 * i = 2
 * Right shift: 5 >> (2 - 1) = 5 >> 1 = 2 (binary: 0010)
 * AND with 1: 2 & 1 = 0 (binary: 0000)
 * So, the 2nd bit of 5 is 0.
 * 
 * For set:
 * To set the ith bit of a number, we can perform a bitwise OR operation with a mask that has the ith bit set to 1.
 * Example:
 * num = 5 (binary: 0101)
 * i = 2
 * Mask = 1 << (i - 1) = 1 << 1 = 2 (binary: 0010)
 * OR operation: 5 | 2 = 7 (binary: 0111)
 * So, setting the 2nd bit of 5 results in 7.
 * 
 * For clear:
 * To clear the ith bit of a number, we can perform a bitwise AND operation with the negation of a mask that has the ith bit set to 1.
 * Example:
 * num = 5 (binary: 0101)
 * i = 2
 * Mask = 1 << (i - 1) = 1 << 1 = 2 (binary: 0010)
 * Negation: ~2 = -3 (binary: 1101 in 4-bit representation)
 * AND operation: 5 & -3 = 5 (binary: 0101)
 * So, clearing the 2nd bit of 5 results in 5 itself, as the 2nd bit was already 0.
 *  
 */

public class bitManipulation {
    static void bitMan(int num, int i) {
        int get = (num >> (i - 1)) & 1;
        int set = num | (1 << (i - 1));
        int clear = num & (~(1 << (i - 1)));
        
        System.out.print(get + " " + set + " " + clear);
        
    }
}
