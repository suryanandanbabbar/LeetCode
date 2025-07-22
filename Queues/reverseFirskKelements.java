package Queues;
// GfG: Reverse First K Elements of Queue
// Link: https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue

// TC: O(n)
// SC: O(n)

import java.util.*;

public class reverseFirskKelements {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (q.size() < k)
            return q;

        Queue<Integer> result = new LinkedList<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            result.offer(stack.pop());
        }

        while (!q.isEmpty()) {
            result.offer(q.poll());
        }

        return result;
    }
}
