package Binary_Tree;
// GfG: Children Sum Parent
// Link: https://www.geeksforgeeks.org/problems/children-sum-parent/1

// TC: O(N)
// SC: O(H)

public class childrenSumBinaryTree {
    public static int isSumProperty(Node root) {
        if(root == null) return 1;
        if(root.left == null && root.right == null) return 1;
        
        int left = (root.left != null) ? root.left.data : 0;
        int right = (root.right != null) ? root.right.data : 0;
        
        if(root.data != left + right) return 0;
        
        return isSumProperty(root.left) & isSumProperty(root.right);
    }
}
