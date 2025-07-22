package Two_Pointers;
// LeetCode Problem 14: Longest Common Prefix
// Link: https://leetcode.com/problems/longest-common-prefix/

// TC: O(n * m)
// SC: O(1)

import java.util.*;

class longestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        // if(strs.length == 0) return "";

        // String prefix = strs[0];
        // for(int i = 1; i < strs.length; i++) {
        //     while(strs[i].indexOf(prefix) != 0) {
        //         prefix = prefix.substring(0,prefix.length() - 1);
        //         if(prefix.isEmpty()) return "";
        //     }
        // }
        // return prefix;

        // Using Sort
        if (strs.length == 0) return "";
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        String result = "";
        for(int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            result += first.charAt(i);
        }

        return result;
    }
}