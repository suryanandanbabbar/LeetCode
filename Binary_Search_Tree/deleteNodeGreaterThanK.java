package Binary_Search_Tree;
// GfG: Delete Nodes Greater Than K
// Link: https://www.geeksforgeeks.org/problems/delete-nodes-greater-than-k/1

// TC: O(N)
// SC: O(N) 

public class deleteNodeGreaterThanK {
    public Node deleteNode(Node root, int k) {
        if(root == null) return null;    
        
        if(root.data < k) {
            root.right = deleteNode(root.right, k);
            return root;
        }
        else return deleteNode(root.left, k);
    }
}
