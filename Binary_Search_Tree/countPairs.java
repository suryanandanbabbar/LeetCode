package Binary_Search_Tree;
// GfG: https://www.geeksforgeeks.org/problems/brothers-from-different-root/1

// TC: O(N1 + N2)
// SC: O(N1 + N2)

import java.util.ArrayList;

public class countPairs {
    private static ArrayList<Integer> inOrder(Node root, ArrayList<Integer> list) {
        if (root != null) {
            inOrder(root.left, list);
            list.add(root.data);
            inOrder(root.right, list);
        }
        return list;
    }

    public static int count(Node root1, Node root2, int x) {
        ArrayList<Integer> bst1 = new ArrayList<>();
        bst1 = inOrder(root1, bst1);

        ArrayList<Integer> bst2 = new ArrayList<>();
        bst2 = inOrder(root2, bst2);

        int count = 0;
        int i = 0, j = bst2.size() - 1;
        while (i < bst1.size() && j >= 0) {
            int val1 = bst1.get(i);
            int val2 = bst2.get(j);

            if (val1 + val2 == x) {
                count++;
                i++;
                j--;
            }

            else if (val1 + val2 < x)
                i++;
            else
                j--;
        }

        return count;
    }
}
