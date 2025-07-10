package Stack;
// LeetCode Problem: 682. Baseball Game
// Link: https://leetcode.com/problems/baseball-game/

// TC: O(n)
// SC: O(n)

import java.util.ArrayDeque;

public class baseballGame {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();
                int newScore = last + secondLast;
                stack.push(last); 
                stack.push(newScore);
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}

