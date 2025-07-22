package Stack;
// LeetCode Problem: 3174. Clear Digits
// Link: https://leetcode.com/problems/clear-digits/

// TC: O(n)
// SC: O(n)

import java.util.ArrayDeque;

class clearDigitsSolution {
    public String clearDigits(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(char c: s.toCharArray()) {
            if(Character.isDigit(c)) {
                if(!stack.isEmpty()) 
                    stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}