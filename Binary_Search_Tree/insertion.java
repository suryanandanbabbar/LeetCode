package Binary_Search_Tree;
// LeetCode Problem: 701. Insert into Binary Search Tree
// Link: https://leetcode.com/problems/insert-into-a-binary-search-tree/

// TC: O(n) worst-case
// SC: O(n) worst-case

public class insertion {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(val < root.val) {
            if(root.left == null) {
                root.left = new TreeNode(val);
            } else {
                insertIntoBST(root.left, val);
            }
        } else {
            if(root.right == null) {
                root.right = new TreeNode(val);
            } else {
                insertIntoBST(root.right, val);
            }
        }
        return root;
    }
}
