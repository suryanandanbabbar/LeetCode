package Stack;
// LeetCode Problem: 1653. Minimum Deletions to Make String Balanced
// Link: https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/

// TC: O(n)
// SC: O(n)

import java.util.*;

class minDeletionStringBalanced {
    public int minimumDeletions(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        int count = 0;
        for(char c: s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == 'b' && c == 'a') {
                count++;
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        return count;
    }
}
