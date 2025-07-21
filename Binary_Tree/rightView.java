package Binary_Tree;
// LeetCode Problem: 199. Binary Tree Right Side View
// Link: https://leetcode.com/problems/binary-tree-right-side-view/description/

// TC: O(N)
// SC: O(H)

import java.util.ArrayList;
import java.util.List;

public class rightView {
    private void solve(TreeNode node, List<Integer> ans, int level) {
        if (node == null)
            return;
        if (level == ans.size())
            ans.add(node.val);

        solve(node.right, ans, level + 1);
        solve(node.left, ans, level + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        solve(root, ans, 0);
        return ans;
    }
}
