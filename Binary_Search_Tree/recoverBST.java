package Binary_Search_Tree;
// LeetCode Problem: 99. Recover Binary Search Tree
// Link: https://leetcode.com/problems/recover-binary-search-tree/description/

// TC: O(N)
// SC: O(H) where H is the height of the tree

public class recoverBST {
    TreeNode prev = null, first = null, second = null;

    void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        if (prev != null && root.val < prev.val) {
            if (first == null)
                first = prev;
            second = root;
        }
        prev = root;
        inorder(root.right);
    }

    public void recoverTree(TreeNode root) {
        if (root == null)
            return;
        inorder(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

}
