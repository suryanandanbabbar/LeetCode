package Binary_Tree;
// LeetCode Problem: 117. Populating Next Right Pointers in Each Node2 II
// Link: https://leetcode.com/problems/populating-next-right-pointers-in-each-node2-ii/description/

// TC: O(N)
// SC: O(N) 

import java.util.LinkedList;
import java.util.Queue;

final class Node2 {
    public int val;
    public Node2 left;
    public Node2 right;
    public Node2 next;

    public Node2() {}
    
    public Node2(int _val) {
        val = _val;
    }

    public Node2(int _val, Node2 _left, Node2 _right, Node2 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

public class populateNextPointer {
    public Node2 connect(Node2 root) {
        if(root == null) return null;

        Queue<Node2> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            int size = q.size();
            Node2 prev = null;

            for(int i = 0; i < size; i++) {
                Node2 node2 = q.poll();
                
                if(prev != null) prev.next = node2;
                prev = node2;
                
                if(node2.left != null) q.offer(node2.left);
                if(node2.right != null) q.offer(node2.right);
            }
            prev.next = null;
        }

        return root;
    }
}
