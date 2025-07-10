package Stack;
// LeetCode Problem: 921. Minimum Add to Make Parentheses Valid
// Link: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

import java.util.*;

class minAddtoValidParentheses {
    public int minAddToMakeValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        int count = 0;

        for (char i : s.toCharArray()) {
            if (i == '(')
                stack.push(i);
            else {
                if (stack.isEmpty())
                    count++;
                else
                    stack.pop();
            }
        }
        return count + stack.size();
    }
}