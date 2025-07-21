package Binary_Search_Tree;
// GfG: https://www.geeksforgeeks.org/problems/print-common-nodes-in-bst/1

// TC: O(N1 + N2)
// SC: O(N1 + N2)

import java.util.ArrayList;

public class intersection {
    private static void inOrder(Node root, ArrayList<Integer> list) {
        if (root != null) {
            inOrder(root.left, list);
            list.add(root.data);
            inOrder(root.right, list);
        }
    }

    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        ArrayList<Integer> bst1 = new ArrayList<>();
        ArrayList<Integer> bst2 = new ArrayList<>();

        inOrder(r1, bst1);
        inOrder(r2, bst2);

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < bst1.size() && j < bst2.size()) {
            int val1 = bst1.get(i);
            int val2 = bst2.get(j);

            if (val1 == val2) {
                result.add(val1);
                i++;
                j++;
            } else if (val1 < val2) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}
