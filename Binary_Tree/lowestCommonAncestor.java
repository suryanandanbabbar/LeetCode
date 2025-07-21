package Binary_Tree;
// LeetCode Problem: 236. Lowest Common Ancestor of a Binary Tree
// Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

// TC: O(N)
// SC: O(H)

public class lowestCommonAncestor {
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root;
        if(root == p || root == q) return root;
        
        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);

        if(left == null) return right;
        else if(right == null) return left;
        else return root;
    }
}
