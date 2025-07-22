package Binary_Search_Tree;
// GfG: Minimum Element in BST
// Link: https://www.geeksforgeeks.org/problems/minimum-element-in-bst/1

// TC: O(H)
// SC: O(1)

public class minimumValue {
    int minValue(Node root) {
        Node current = root;
        while(current != null && current.left != null) {
            current = current.left;
        }
        return current.data;
    }
}
