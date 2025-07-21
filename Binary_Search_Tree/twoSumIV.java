package Binary_Search_Tree;
// LeetCode Problem: 653. Two Sum IV - Input is a BST
// Link: https://leetcode.com/problems/two-sum-iv-input-is-a-bst

// TC: O(N)
// SC: O(N)

import java.util.ArrayList;

public class twoSumIV {
    private ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> list) {
        if(root != null) {
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
        return list;
    }

    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);

        System.out.println(list);
        
        int start = 0;
        int end = list.size() - 1;

        while(start < end) {
            int sum = list.get(start) + list.get(end);
            if(sum == k) return true;
            else if (sum > k) end--;
            else start++;
        }
        return false;
    }
}
