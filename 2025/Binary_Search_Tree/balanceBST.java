package Binary_Search_Tree;
// LeetCode Problem: 1382. Balance a Binary Search Tree
// Link: https://leetcode.com/problems/balance-a-binary-search-tree/description/

// TC: O(N)
// SC: O(N)

import java.util.ArrayList;

public class balanceBST {
    private ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> list) {
        if(root != null) {
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
        return list;
    }

    private TreeNode createBST(ArrayList<Integer> nums, int start, int end) {
        if(start > end) return null;

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = createBST(nums, start, mid - 1);
        root.right = createBST(nums, mid + 1, end);
        return root;
    }

    public TreeNode balance(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return createBST(list, 0, list.size() - 1);
    }
}
