package Binary_Tree;
// LeetCode Problem: 111. Minimum Depth of Binary Tree
// Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/

public class minimumDepth {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;

        int l = minDepth(root.left);
        int r = minDepth(root.right);

        System.out.println(l);
        System.out.println(r);

        if(l == 0 || r == 0) return l + r + 1;
        return 1 + Math.min(l, r);
    }
}
