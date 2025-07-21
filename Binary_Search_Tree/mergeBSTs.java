package Binary_Search_Tree;
// GfG: https://www.geeksforgeeks.org/problems/merge-two-bst-s/1

// TC: O(N + M) where N and M are the number of nodes in the two BSTs
// SC: O(N + M) for the result list

import java.util.ArrayList;

public class mergeBSTs {
    private ArrayList<Integer> inOrder(Node root, ArrayList<Integer> list) {
        if(root != null) {
            inOrder(root.left, list);
            list.add(root.data);
            inOrder(root.right, list);
        }
        return list;
    }
    
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public ArrayList<Integer> merge(Node root1, Node root2) {
        ArrayList<Integer> bst1 = new ArrayList<>();
        inOrder(root1, bst1);
        
        ArrayList<Integer> bst2 = new ArrayList<>();
        inOrder(root2, bst2);
        
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        
        while(i < bst1.size() && j < bst2.size()) {
            if(bst1.get(i) <= bst2.get(j)) {
                result.add(bst1.get(i));
                i++;
            } else {
                result.add(bst2.get(j));
                j++;
            }
        }
        
        while(i < bst1.size()) {
            result.add(bst1.get(i));
            i++;
        }
        
        while(j < bst2.size()) {
            result.add(bst2.get(j));
            j++;
        }
        
        return result;
        
    }
}
