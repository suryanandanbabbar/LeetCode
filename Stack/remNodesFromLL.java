package Stack;
// LeetCode Problem: 2487. Remove Nodes From Linked List
// Link: https://leetcode.com/problems/remove-nodes-from-linked-list/

// TC: O(n)
// SC: O(n)

import java.util.ArrayDeque;

public class remNodesFromLL {
    int val;
    remNodesFromLL next;

    remNodesFromLL() {
    }

    remNodesFromLL(int val) {
        this.val = val;
    }

    remNodesFromLL(int val, remNodesFromLL next) {
        this.val = val;
        this.next = next;
    }
}

class remNodesFromLLSolution {
    public remNodesFromLL removeNodes(remNodesFromLL head) {
        if (head == null || head.next == null) {
            return head;
        }

        ArrayDeque<remNodesFromLL> stack = new ArrayDeque<>();
        remNodesFromLL current = head;

        while(current != null) {
            while(!stack.isEmpty() && stack.peek().val < current.val) {
                stack.pop();
            }
            stack.push(current);
            current = current.next;
        }

        remNodesFromLL temp = new remNodesFromLL(0);
        remNodesFromLL tail = temp;

        ArrayDeque<remNodesFromLL> reverseStack = new ArrayDeque<>();
        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }

        while(!reverseStack.isEmpty()) {
            tail.next = reverseStack.pop();
            tail = tail.next;
        }

        tail.next = null;
        return temp.next;

    }
}