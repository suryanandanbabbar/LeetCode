package Binary_Tree;
// LeetCode Problem: 101. Symmetric Tree
// Link: https://leetcode.com/problems/symmetric-tree/

// TC: O(N)
// SC: O(N)

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class symmetricTree {
    private boolean check(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        return p.val == q.val && check(p.right, q.left) && check(p.left, q.right);
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }
}

