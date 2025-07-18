package Binary_Search_Tree;
// GfG: https://practice.geeksforgeeks.org/problems/print-bst-elements-in-given-range/1

// TC: O(N)
// SC: O(N)

import java.util.ArrayList;

public class printInRange {
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrderRange(root, low, high, list);
        return list;
    }

    private static void inOrderRange(Node root, int low, int high, ArrayList<Integer> list) {
        if (root == null) return;

        if (root.data > low) {
            inOrderRange(root.left, low, high, list);
        }

        if (root.data >= low && root.data <= high) {
            list.add(root.data);
        }

        if (root.data < high) {
            inOrderRange(root.right, low, high, list);
        }
    }
    
}
