package Stack;
// LeetCode Problem: 232. Implement Queue using Stacks
// Link: https://leetcode.com/problems/implement-queue-using-stacks/

import java.util.ArrayDeque;

class MyQueue {
    ArrayDeque<Integer> stack1 = new ArrayDeque<>();
    ArrayDeque<Integer> stack2 = new ArrayDeque<>();

    public MyQueue() {

    }
    
    public void push1(int x) {
        if(stack1.isEmpty()) {
            stack1.push(x);
            return;
        }

        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(x);

        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Using Recursion with one stack
    public void push2(int x) {
        if (stack1.isEmpty()) {
            stack1.push(x);
        } else {
            int temp = stack1.pop();
            push2(x);
            stack1.push(temp);
        }
    }
    
    public int pop() {
        return stack1.pop();
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }


}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */