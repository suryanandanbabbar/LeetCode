package Graphs;
// NeetCode: Count Connected Components
// Link: https://neetcode.io/problems/count-connected-components

// TC: O(V + E) 
// SC: O(V + E) 

import java.util.ArrayList;
import java.util.List;

public class countConnectedComponents {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>(n);
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited);
                count++;
            }
        }

        return count;
    }

    private void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }
}
