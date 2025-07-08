// GfG: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620

// TC: O(n)
// SC: O(n)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class nextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(arr.length, -1));
        
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            } if(!stack.isEmpty()) {
                result.set(i, stack.peek());
            }
            stack.push(arr[i]);
        }
        
        return result;
    }
}

// LeetCode Problem: 1019: Next Greater Node In Linked List
// Link: https://leetcode.com/problems/next-greater-node-in-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        int listSize = list.size();
        int[] result = new int[listSize];
        for(int i = 0; i < listSize; i++) result[i] = 0;

        for(int i = listSize - 1; i >= 0; i--) {
            while(!stack.isEmpty() && list.get(i) >= stack.peek()) stack.pop();
            if(!stack.isEmpty()) result[i] = stack.peek();
            stack.push(list.get(i));
        }

        return result;
    }
}