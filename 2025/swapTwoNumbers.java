// GfG: https://www.geeksforgeeks.org/problems/swap-two-numbers3844/1

// TC: O(1)
// SC: O(1)

import java.util.*;

class swapTwoNumbers {
    static List<Integer> get(int a, int b) {
        List<Integer> result = new ArrayList<>();
        
        a ^= b;
        b ^= a;
        a ^= b;
        
        result.add(a);
        result.add(b);
        
        return result;
    }
}