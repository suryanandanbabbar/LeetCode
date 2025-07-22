package Binary_Search_Tree;
// GfG: Check Whether BST Contains Dead End
// Link: https://www.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1

// TC: O(N)
// SC: O(N)

import java.util.HashSet;
import java.util.Set;

public class deadEnd {  
    private void store(Node root, Set<Integer> set, Set<Integer> leaves) {
        if (root == null) return;

        set.add(root.data);

        if (root.left == null && root.right == null) 
            leaves.add(root.data);
        

        store(root.left, set, leaves);
        store(root.right, set, leaves);
    }

    public boolean isDeadEnd(Node root) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> leaves = new HashSet<>();

        set.add(0);

        store(root, set, leaves);

        for (int leaf : leaves) {
            if (set.contains(leaf - 1) && set.contains(leaf + 1)) return true;
        }

        return false;
    }
     
}
