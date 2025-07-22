package Binary_Tree;
// LeetCode Problem: 669. Trim a Binary Search Tree
// Link: https://leetcode.com/problems/trim-a-binary-search-tree/description/

// TC: O(N)
// SC: O(H) 

public class trimBST {
    public TreeNode trim(TreeNode root, int low, int high) {
        if (root == null)
            return null;

        if (root.val >= low && root.val <= high) {
            root.left = trim(root.left, low, high);
            root.right = trim(root.right, low, high);
        } else if (root.val < low) {
            root = trim(root.right, low, high);
        } else if (root.val > high) {
            root = trim(root.left, low, high);
        }
        return root;
    }
}