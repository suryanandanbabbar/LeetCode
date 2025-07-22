package Binary_Tree;
// GfG: Bottom View of Binary Tree
// Link: https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

// TC: O(N log N)
// SC: O(N)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class bottomView {
    static class Pair {
        Node node;
        int line;
        
        Pair(Node node, int line) {
            this.node = node;
            this.line = line;
        }
    }

    static ArrayList<Integer> view(Node root) {
        if(root == null) return new ArrayList<>();
        
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()) {
            Pair it = q.poll();
            Node node = it.node;
            int line = it.line;
            
            map.put(line, node.data);

            if (node.left != null) q.offer(new Pair(node.left, line - 1));

            if (node.right != null) q.offer(new Pair(node.right, line + 1));
        }
        
        for(int values: map.values()) result.add(values);
        
        return result;
    }
}


