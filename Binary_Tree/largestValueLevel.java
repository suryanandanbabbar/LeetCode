package Binary_Tree;
// GfG: https://www.geeksforgeeks.org/problems/largest-value-in-each-level/1

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class largestValueLevel {
    public ArrayList<Integer> largestValues(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        if(root == null) return list;
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            int max = Integer.MIN_VALUE;
            while(size > 0) {
                Node node = q.remove();
                
                if(node.data > max) max = node.data;
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                
                size--;
            }
            list.add(max);
        }
        
        return list;
    }
}

