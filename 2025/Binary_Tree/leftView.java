package Binary_Tree;
// GfG: https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1

// TC: O(N)
// SC: O(N)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class leftView {
    // For Recursion
    private void solve(Node node, ArrayList<Integer> ans, int level) {
        if(node == null) return;
        if(level == ans.size()) ans.add(node.data);
        
        solve(node.left, ans, level + 1);
        solve(node.right, ans, level + 1);
    }

    ArrayList<Integer> left(Node root) {
        if (root == null)
            return new ArrayList<>();

        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        // Level-Order Traversal Approach
        /* 

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (i == 0)
                    result.add(node.data);

                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
        }

        return result;
        */

        // Recursive Approach
        solve(root, result, 0);
        return result;

    }

}
