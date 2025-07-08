// LeetCode Problem: Binary Tree Inorder Traversal
// Link: https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.*;

class binaryTreeInorder {
    public static List<Integer> inorder(List<Integer> result, TreeNode root) {
        if(root == null) return result;

        inorder(result, root.left);
        result.add(root.val);
        inorder(result, root.right);
        return result;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return inorder(result, root);
    }
}