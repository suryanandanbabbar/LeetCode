package Binary_Tree;
// LeetCode Problem: 117. Populating Next Right Pointers in Each Node II
// Link: https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/

// TC: O(N)
// SC: O(1) for the next pointers, O(N) for the queue

import java.util.LinkedList;
import java.util.Queue;

final class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

public class populateNextPointer {
    public Node connect(Node root) {
        if(root == null) return null;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            int size = q.size();
            Node prev = null;

            for(int i = 0; i < size; i++) {
                Node node = q.poll();
                
                if(prev != null) prev.next = node;
                prev = node;
                
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            prev.next = null;
        }

        return root;
    }
}
