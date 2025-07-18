package Binary_Search_Tree;
// GfG: https://www.geeksforgeeks.org/problems/sum-of-k-smallest-elements-in-bst3029/1

// TC: O(N)
// SC: O(N)

public class kSmallestElementSum {
    int solve(Node node, int k) {
        if (node == null || k <= 0) return 0;

        int leftSum = solve(node.left, k);
        if (k <= 0) return leftSum; 

        k--; 
        int currentSum = node.data + leftSum; 

        if (k == 0) return currentSum; 

        return currentSum + solve(node.right, k);
    }
    
    int sum(Node root, int k) {
        if (root == null || k <= 0) return 0;

        return solve(root, k);
    }
}
