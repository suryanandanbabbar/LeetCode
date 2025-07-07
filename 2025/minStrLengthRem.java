// LeetCode Problem: 2696. Minimum String Length After Removing Substrings
// Link: https://leetcode.com/problems/minimum-string-length-after-removing-substrings/

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.ArrayDeque;

public class minStrLengthRem {
    public int minLength(String s) {
        int result = s.length();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == 'A' && c == 'B') {
                stack.pop();
            } else if (!stack.isEmpty() && stack.peek() == 'C' && c == 'D') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        result = stack.size();
        return result;

    }
}
