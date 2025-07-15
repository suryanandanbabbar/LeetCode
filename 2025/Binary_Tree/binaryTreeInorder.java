package Binary_Tree;
// LeetCode Problem: Binary Tree Inorder Traversal
// Link: https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

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