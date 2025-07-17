package Binary_Search_Tree;
// GfG: https://www.geeksforgeeks.org/problems/median-of-bst/1

// TC: O(N)
// SC: O(N)

import java.util.ArrayList;

public class median {
    public static ArrayList<Integer> inOrder(Node root, ArrayList<Integer> list) {
        if(root != null) {
            inOrder(root.left, list);
            list.add(root.data);
            inOrder(root.right, list);
        }
        return list;
    }
    public static float findMedian(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = inOrder(root, list);
        
        int n = list.size();
        
        if(n % 2 == 1) {
            return list.get(n / 2);
        } else {
            int mid1 = list.get((n / 2) - 1);
            int mid2 = list.get(n / 2);
            return (mid1 + mid2) / 2.0f;
        }
        
    }
}
