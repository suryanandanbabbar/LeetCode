// GfG: https://www.geeksforgeeks.org/problems/rightmost-different-bit-1587115621/1

// TC: O(log(max(m, n)))
// SC: O(1)

public class rightMostDifferentBit {
    public static int posOfRightMostDiffBit(int m, int n) {
        int result = 1;
        int xor = m ^ n;
        
        if(xor == 0) return -1;
        
        while(xor > 0) {
            if((xor & 1) == 1) return result;
            result++;
            xor = xor >> 1;
        }
        
        return result;
    }
}
