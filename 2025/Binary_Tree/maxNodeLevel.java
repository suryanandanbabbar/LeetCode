package Binary_Tree;
// GfG: https://www.geeksforgeeks.org/problems/maximum-node-level/1

// TC: O(n)
// SC: O(n)

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class maxNodeLevel {
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maximumNodeLevel(Node root) {
        Queue<Node> q = new LinkedList<>();
        int level = 0;
        int maxLevel = 0;
        int maxCount = 0;
        
        if(root == null) return -1;
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            
            if(size > maxCount) {
                maxCount = size;
                maxLevel = level;
            }
            
            for(int i = 0; i < size; i++) {
                Node node = q.poll();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            level++;
            
        }
        
        return maxLevel;
    }
}
