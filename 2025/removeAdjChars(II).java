// LeetCode Problem: 1209: Remove All Adjacent Duplicates in String II
// Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/

import java.util.ArrayDeque;

class removeAdjCharsII {
    public String removeDuplicates(String s, int k) {
        // Using Two Stacks
        // TC: O(n)
        // SC: O(n)
        /* 
        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Integer> count = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                int newCount = count.pop() + 1;
                if (newCount == k) {
                    stack.pop();
                } else {
                    count.push(newCount);
                }
            } else {
                stack.push(c);
                count.push(1);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            char c = stack.pop();
            int freq = count.pop();
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }

        return sb.reverse().toString();
        */

        // Using One Stack 
        // TC: O(n)
        // SC: O(n)
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == c) {
                stack.peek()[1]++;
                if (stack.peek()[1] == k) {
                    stack.pop();
                }
            } else {
                stack.push(new int[]{c, 1});
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            int[] top = stack.pop();
            for (int i = 0; i < top[1]; i++) {
                sb.append((char) top[0]);
            }
        }
        return sb.reverse().toString();

    }
}



