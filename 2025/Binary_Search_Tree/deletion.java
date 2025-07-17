package Binary_Search_Tree;
// LeetCode Problem: 450. Delete Node in BST
// Link: https://leetcode.com/problems/delete-node-in-a-bst/submissions/1701090443/

import java.util.ArrayList;

// TC: O(H)
// SC: O(H)

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

    // Another approach
    private ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> list) {
        if(root != null) {
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
        return list;
    }

    private TreeNode createBST(ArrayList<Integer> list, int start, int end) {
        if(start > end) return null;

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = createBST(list, start, mid - 1);
        root.right = createBST(list, mid + 1, end);
        return root;
    }

    public TreeNode deleteNode2(TreeNode root, int key) {
        ArrayList<Integer> list = new ArrayList<>();
        list = inOrder(root, list);

        list.remove(Integer.valueOf(key));

        return createBST(list, 0, list.size() - 1);    
    }
}
