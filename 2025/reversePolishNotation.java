// LeetCode Problem: 150. Evaluate Reverse Polish Notation
// Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/

// TC: O(n)
// SC: O(n)

import java.util.ArrayDeque;

public class reversePolishNotation {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String s : tokens) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                stack.push(Integer.parseInt(s));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (s) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }
}
