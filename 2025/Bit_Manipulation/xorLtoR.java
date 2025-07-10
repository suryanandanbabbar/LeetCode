package Bit_Manipulation;
// GfG: https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1

// TC: O(1)
// SC: O(1)

/*
 * For XOR 1 to N:
 * n % 4 == 1 -> xor = 1
 * n % 4 == 2 -> xor = n + 1
 * n % 4 == 3 -> xor = 0
 * n % 4 == 0 -> xor = n
 */

public class xorLtoR {
    public static int findXOR(int l, int r) {
       int xor = x(l - 1) ^ x(r);
       return xor;
       
    }    
    
    public static int x(int n) {
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n + 1;
        if(n % 4 == 3) return 0;
        if(n % 4 == 0) return n;
        else return -1;
    }

    public static void main(String[] args) {
        int l = 4;
        int r = 8;

        System.out.println(findXOR(l, r));
    }
}