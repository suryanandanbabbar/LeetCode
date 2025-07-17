package Binary_Search_Tree;
// GfG: https://www.geeksforgeeks.org/problems/predecessor-and-successor/1

// TC: O(N)
// SC: O(N)

import java.util.ArrayList;

public class predecessorSuccessor {
    public static ArrayList<Node> inOrder(Node root, ArrayList<Node> list){
        if(root != null){
            inOrder(root.left,list);
            list.add(root);
            inOrder(root.right,list);
        }
        return list;
    }
    
    public ArrayList<Node> findPreSuc(Node root, int key) {
        ArrayList<Node> list = new ArrayList<Node>();
        inOrder(root,list);
        
        Node p = null;
        Node s = null;
        
         for (int i = 0; i < list.size(); i++) {
            if (list.get(i).data < key) p = list.get(i);
            else if (list.get(i).data > key) {
                s = list.get(i);
                break; 
            }
        }
        
        list.clear();
        list.add(p);  
        list.add(s); 
        
        return list; 
    }
}
