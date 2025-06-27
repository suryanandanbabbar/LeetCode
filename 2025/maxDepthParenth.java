// LeetCode Problem 1614: Maximum Nesting Depth of the Parentheses
// Link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

import java.util.Stack;
class Solution {
    public int maxDepth(String s) {
        Stack<Integer> stack = new Stack<>();
        int maxDepth = 0;
        int currentDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                stack.push(currentDepth);
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    currentDepth--;
                }
            }
        }
        return maxDepth;
    }
}

