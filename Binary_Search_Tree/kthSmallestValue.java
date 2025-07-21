package Binary_Search_Tree;
// LeetCode Problem: 230. Kth Smallest Element in a BST
// Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/description

// TC: O(H + k)
// SC: O(H)

public class kthSmallestValue {
    int ans = 0;
    int k;
    private void inOrder(TreeNode root) {
        if(root == null || k < 0) return;
        inOrder(root.left);
        k--;
        if(k == 0) ans = root.val;
        inOrder(root.right);  
    }

    public int kthSmallest(TreeNode root, int k) {
        ans = 0;
        this.k = k;
        inOrder(root);
        return ans;
    }
}
