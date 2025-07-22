package Binary_Tree;
// LeetCode Problem: 543. Diameter of Binary Tree
// Link: https://leetcode.com/problems/diameter-of-binary-tree/

// TC: O(n)
// SC: O(h) 

public class diameterBST {
    int diameter;

    public int solve(TreeNode root) {
        if(root == null) return 0;

        int left = solve(root.left);
        int right = solve(root.right);
        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        solve(root);
        return diameter;
    }
}

