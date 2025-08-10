package Bit_Manipulation;
// LeetCode Problem: 869. Reordered Power of 2
// Link: https://leetcode.com/problems/reordered-power-of-2/description/

import java.util.Arrays;

// TC: O(n log n)
// SC: O(n)

public class reorderedPowerOfTwo {
    private String sort(int x) {
        char[] array = String.valueOf(x).toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public boolean reorderedPowerOf2(int n) {
        String target = sort(n);

        for(int i = 0; i < 31; i++) 
            if(sort(1 << i).equals(target)) return true;
        
        return false;
    }
}
