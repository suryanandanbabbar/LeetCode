package Binary_Tree;
// LeetCode Problem: 226. Binary Tree
// Link: https://leetcode.com/problems/invert-binary-tree/description/

// TC: O(N)
// SC: O(H)

public class invertTree {
    public TreeNode invert(TreeNode root) {
        if(root == null) return root;
        if(root.left == null && root.right == null) return root;

        invert(root.left);
        invert(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
}
