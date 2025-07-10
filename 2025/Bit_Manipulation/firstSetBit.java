package Bit_Manipulation;
// GfG: https://www.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1

// TC: O(log n)
// SC: O(1)

public class firstSetBit {
    public static int getFirstSetBit(int n) {
        int result = 1;
        
        while(n > 0) {
            if((n & 1) == 1) {
                return result;
            } else {
                n = n >> 1;
            }
            result++;
        }
        return result;
    }
}
