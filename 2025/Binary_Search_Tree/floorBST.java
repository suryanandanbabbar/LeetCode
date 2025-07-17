package Binary_Search_Tree;
// GfG: https://www.geeksforgeeks.org/problems/floor-in-bst/1

// TC: O(h)
// TC: O(1)

public class floorBST {
   public static int floor(Node root, int key) {
        int floor = -1;

        while (root != null) {
            if (root.data == key) {
                return key;
            } else if (root.data > key) {
                root = root.left;
            } else {
                floor = root.data;
                root = root.right;
            }
        }
        
        return floor;
    } 
}
