package Binary_Tree;
// LeetCode Problem: 112. Path Sum
// Link: https://leetcode.com/problems/path-sum/submissions/1699844158/

// TC: O(N)
// SC: O(N)

public class hasPathSum {
    public boolean hasSum(TreeNode root, int targetSum) {
       if (root == null) return false;

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        return hasSum(root.left, targetSum - root.val) || hasSum(root.right, targetSum - root.val);
    }
}

