package Bit_Manipulation;
// GfG: https://www.geeksforgeeks.org/problems/odd-or-even3618/1

// TC: O(1)
// SC: O(1)


/*
 * If last bit of a number is 0, then it is even.
 * Else, it is odd.
 * 5 : 101 -> Last Bit is 1 -> Odd
 * 6 : 110 -> Last Bit is 0 -> Even
 */

public class oddEven {
    static boolean isEven(int n) {
        int result = n & 1;
        if(result == 0) return true;
        else return false;
        
    }
}
