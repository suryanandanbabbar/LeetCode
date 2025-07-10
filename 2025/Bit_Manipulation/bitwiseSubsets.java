package Bit_Manipulation;
// GfG: https://www.geeksforgeeks.org/problems/print-all-bitwise-subsets-of-a-number-n3301/1

// TC: O(n)
// SC: O(n)

import java.util.ArrayList;
import java.util.Collections;

public class bitwiseSubsets {
    ArrayList<Integer> printSubsets(int N) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i <= N; i++) {
            if((N & i) == i) result.add((N & i));
        }    
        Collections.reverse(result);
        return result;
    }
}
