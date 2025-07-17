package Binary_Search_Tree;
// LeetCode Problem: 700. Search in a Binary Search Tree
// Link: https://leetcode.com/problems/search-in-a-binary-search-tree/

// TC: O(H)
// SC: O(H)

public class searchBST {
    public TreeNode search(TreeNode root, int val) {
        // Recursive Approach
        if(root == null) return root;
        if(root.val == val) return root;
        if(val < root.val) return search(root.left, val);
        if(val > root.val) return search(root.right, val);

        // Iterative Approach
        while(root != null) {
            if(root.val == val) return root;
            if(root.val > val) return search(root.left, val);
            else if(root.val < val) return search(root.right, val);
        }
        return null;
    }
}
