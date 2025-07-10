package Stack;
// LeetCode Problem: 735. Asteroid Collision
// Link: https://leetcode.com/problems/asteroid-collision/

// TC: O(n)
// SC: O(n)

import java.util.ArrayDeque;

public class asteroidCollision {
    public int[] asteroidCol(int[] asteroids) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int a : asteroids) {
            if (a > 0) {
                stack.push(a);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(a);
                }

                if (stack.peek() == -a) {
                    stack.pop();
                }
            }
        }

        int[] result = new int[stack.size()];
        int i = stack.size() - 1;

        while (!stack.isEmpty()) {
            result[i--] = stack.pop();
        }

        return result;
    }
}
