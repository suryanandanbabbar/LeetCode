package Binary_Tree;
// LeetCode Problem: 872. Leaf-Similar Trees
// Link: https://leetcode.com/problems/leaf-similar-trees/

import java.util.ArrayList;

public class leafSimilarTrees {
    private void insert(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        if (root.left == null && root.right == null) list.add(root.val);

        insert(root.left, list);
        insert(root.right, list);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> q = new ArrayList<>();

        insert(root1, p);
        insert(root2, q);

        return p.equals(q);
    }
}
