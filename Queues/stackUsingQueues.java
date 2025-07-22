package Queues;
// LeetCode Problem: 225. Implement Stack using Queues
// Link: https://leetcode.com/problems/implement-stack-using-queues/

// TC: O(n)
// SC: O(n)

import java.util.LinkedList;
import java.util.Queue;
public class stackUsingQueues {
    // Queues: 
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public stackUsingQueues() {

    }

    public void push(int x) {
        if (queue1 == null) {
            queue1 = new LinkedList<>();
        }
        queue1.offer(x);
    }

    public int pop() {
        if (queue1 == null || queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int poppedValue = queue1.poll();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return poppedValue;
    }

    public int top() {
        if (queue1 == null || queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int topValue = queue1.peek();
        queue2.offer(queue1.poll());
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return topValue;
    }
    public boolean empty() {
        return queue1 == null || queue1.isEmpty();
    }

}
