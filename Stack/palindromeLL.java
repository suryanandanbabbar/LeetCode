package Stack;
// LeetCode Problem: 234. Palindrome Linked List
// Link: https://leetcode.com/problems/palindrome-linked-list/

// TC: O(n)
// SC: O(n)

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class PalListNode {
    int val;
    PalListNode next;
    PalListNode() {}
    PalListNode(int val) { this.val = val; }
    PalListNode(int val, PalListNode next) { this.val = val; this.next = next; }
}

public class palindromeLL {
    public boolean isPalindrome(PalListNode head) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();

        while (head != null) {
            st.push(head.val);
            q.offer(head.val);
            head = head.next;
        }

        while(!st.isEmpty() || !q.isEmpty()) {
            if(st.peek() != q.element()) return false;
            st.pop();
            q.poll();
        }

        return true;        
    }
}
