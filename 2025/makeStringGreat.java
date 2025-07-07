// LeetCode Problem: 1544. Make The String Great
// Link: https://leetcode.com/problems/make-the-string-great/

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.ArrayDeque;

class makeStringGreat {
    public String makeGood(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(char c: s.toCharArray()) {
            if(!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
