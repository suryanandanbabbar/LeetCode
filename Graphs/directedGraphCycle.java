package Graphs;
// GfG: Detect Cycle in a Directed Graph
// Link: https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1

// TC: O(V + E)
// SC: O(V)

import java.util.ArrayList;

public class directedGraphCycle {
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        
        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
        }
        
        boolean[] visited = new boolean[adj.size()];
        boolean[] inRecursion = new boolean[adj.size()];
        
        for(int i = 0; i < V; i++) {
            if(!visited[i] && dfs(adj, i, visited, inRecursion)) return true;
        }
        
        return false;
    }
    
    private boolean dfs(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, boolean[] inRecursion) {
        visited[u] = true;
        inRecursion[u] = true;
        
        for(int v: adj.get(u)) {
            if(!visited[v] && dfs(adj, v, visited, inRecursion)) {
                return true;
            } else if(inRecursion[v] == true) {
                return true;
            }
        }
        inRecursion[u] = false;
        return false;
    }

}
