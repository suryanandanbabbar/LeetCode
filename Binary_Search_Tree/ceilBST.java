package Binary_Search_Tree;
// GfG: Implementing Ceil in BST
// Link: https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1

// TC: O(h)
// SC: O(1)

public class ceilBST {
    int findCeil(Node root, int key) {
        int ceil = -1;

        while (root != null) {
            if (root.data == key) {
                return key;
            } else if (root.data < key) {
                root = root.right;
            } else {
                ceil = root.data;
                root = root.left;
            }
        }

        return ceil;
    }
}
