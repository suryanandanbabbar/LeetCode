package Binary_Tree;
// LeetCode Problem: 110. Balanced Binary Tree
// Link: https://leetcode.com/problems/balanced-binary-tree/

// TC: O(N)
// SC: O(h)

public class balancedBinaryTree {
    private int solve(TreeNode root) {
        if(root == null) return 0;

        int left = solve(root.left);
        int right = solve(root.right);
        if(left == -1 || right == -1) return -1;
        if(Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }
    public boolean isBalanced(TreeNode root) {
        int result = solve(root);
        if(result == -1) return false;
        return true;
    }
}

