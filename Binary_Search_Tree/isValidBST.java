package Binary_Search_Tree;
// LeetCode Problem: 98. Validate Binary Search Tree
// Link: https://leetcode.com/problems/validate-binary-search-tree/description/

import java.util.ArrayList;

// TC: O(H)
// TC: O(H)

public class isValidBST {
    public boolean isBST(TreeNode root) {
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        return isBST(root, min, max);
    }

    private boolean isBST(TreeNode root, long min, long max) {
        if(root == null) return true;
        if(root.val >= max || root.val <= min) return false;
        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }

    // Using inOrder traversal
    private ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> list) {
        if(root != null) {
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
        return list;
    }

    public boolean isBST2(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        list = inOrder(root, list);

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) <= list.get(i - 1)) return false;
        }
        return true;
    }
}
