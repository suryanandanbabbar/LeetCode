package Binary_Tree;
// LeetCode Problem: 100. Same Tree
// Link: https://leetcode.com/problems/same-tree/

// TC: O(N)
// SC: O(N)

public class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

