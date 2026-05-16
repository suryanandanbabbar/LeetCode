/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> q = new ArrayList<>();

        solve(root1, p);
        solve(root2, q);

        return p.equals(q);
    }

    private void solve(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        if(root.left == null && root.right == null) list.add(root.val);

        solve(root.left, list);
        solve(root.right, list);
    }
}