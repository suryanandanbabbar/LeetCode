package Binary_Tree;
// GfG: Root to Leaf Paths
// Link: https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1

// TC: O(N * h)
// SC: O(N * h) 

import java.util.ArrayList;

public class rootToLeafPaths {
    private static void solve(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        if (root == null)
            return;

        path.add(root.data);

        if (root.left == null && root.right == null) {
            result.add(new ArrayList<>(path));
        } else {
            solve(root.left, path, result);
            solve(root.right, path, result);
        }

        path.remove(path.size() - 1);
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solve(root, new ArrayList<>(), result);
        return result;
    }
}
