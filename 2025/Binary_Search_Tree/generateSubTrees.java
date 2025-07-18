package Binary_Search_Tree;
// LeetCode Problem: 95. Unique Binary Search Trees II
// Link: https://leetcode.com/problems/unique-binary-search-trees-ii/description

// TC: O(4^n / n^(3/2))
// SC: O(n)

import java.util.LinkedList;
import java.util.List;

public class generateSubTrees {
    private List<TreeNode> generateSub(int start, int end) {
        List<TreeNode> result = new LinkedList<TreeNode>();
        
        if(start > end) {
            result.add(null);
            return result;
        }

        for(int i = start; i <= end; i++) {
            List<TreeNode> leftTree = generateSub(start, i - 1);
            List<TreeNode> rightTree = generateSub(i + 1, end);

            for(TreeNode left: leftTree) {
                for(TreeNode right: rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }
        return result;
    }
    
    public List<TreeNode> generateTrees(int n) {
        return generateSub(1, n);
    }
}
