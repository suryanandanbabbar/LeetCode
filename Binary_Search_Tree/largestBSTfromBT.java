package Binary_Search_Tree;
// GfG: https://www.geeksforgeeks.org/problems/largest-bst/1

// TC: O(N)
// SC: O(N)

import java.util.ArrayList;

public class largestBSTfromBT {
    private static ArrayList<Integer> inOrder(Node root, ArrayList<Integer> list) {
        if (root != null) {
            inOrder(root.left, list);
            list.add(root.data);
            inOrder(root.right, list);
        }
        return list;
    }

    public static boolean isValid(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        list = inOrder(root, list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1))
                return false;
        }
        return true;
    }

    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        if (root == null)
            return 0;

        if (isValid(root)) {
            return countNodes(root);
        }

        return Math.max(largestBst(root.left), largestBst(root.right));

    }

    private static int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
