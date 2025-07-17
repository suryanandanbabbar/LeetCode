package Binary_Search_Tree;
// LeetCode Problem: 450. Delete Node in BST
// Link: https://leetcode.com/problems/delete-node-in-a-bst/submissions/1701090443/

// TC: O(N)
// SC: O(N)

public class deletion {
    private TreeNode findMin(TreeNode node) {
        TreeNode current = node;
        while(current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;

        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if(key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if(root.left == null) {
                TreeNode temp = root.right;
                root = null;
                return temp;
            } else if(root.right == null) {
                TreeNode temp = root.left;
                root = null;
                return temp;
            }

            TreeNode temp = findMin(root.right);
            root.val = temp.val;
            root.right = deleteNode(root.right, temp.val);
        }
        return root;
    }
}
