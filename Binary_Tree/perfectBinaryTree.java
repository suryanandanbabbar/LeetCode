package Binary_Tree;
// GfG: Perfect Binary Tree
// Link: https://www.geeksforgeeks.org/problems/perfect-binary-tree/1

// TC: O(N)
// SC: O(h)

public class perfectBinaryTree {
    public boolean isPerfect(Node root) {
        if (root == null) return true;

        int depth = getDepth(root);
        return isPerfectUtil(root, depth, 0);

        }

        private int getDepth(Node node) {
            int d = 0;
            while (node != null) {
                d++;
                node = node.left;
            }
            return d;
        }

        private boolean isPerfectUtil(Node node, int depth, int level) {
            if (node == null) return true;
            if (node.left == null && node.right == null)
                return depth == level + 1;
            if (node.left == null || node.right == null)
                return false;
            return isPerfectUtil(node.left, depth, level + 1) &&
                   isPerfectUtil(node.right, depth, level + 1);
    }
}
