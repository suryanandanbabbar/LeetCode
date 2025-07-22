package Graphs;
// GfG: Depth First Traversal of Graph
// Link: https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

// TC: O(V + E) 
// SC: O(V) 

import java.util.ArrayList;

public class DFS {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];

        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, result);
            }
        }

        return result;
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, result);
            }
        }
    }
}
