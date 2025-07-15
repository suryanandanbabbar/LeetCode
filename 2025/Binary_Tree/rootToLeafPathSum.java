package Binary_Tree;
// GfG: https://www.geeksforgeeks.org/problems/root-to-leaf-paths-sum/1

// TC: O(N)
// SC: O(H) H: Height of tree

public class rootToLeafPathSum {

    private static int solve(Node root, int num) {
        if (root == null)
            return 0;

        num = num * 10 + root.data;

        if (root.left == null && root.right == null) {
            return num;
        }

        return solve(root.left, num) + solve(root.right, num);

    }

    public static int treePathsSum(Node root) {
        return solve(root, 0);
    }
}
