package Graphs;
// Code360: Topological Sort
// Link: https://www.naukri.com/code360/problems/topological-sort_982938?leftPanelTabValue=SUBMISSION&customSource=studio_nav&isSignin=true

// TC: O(V + E)
// SC: O(V + E)

import java.util.ArrayList;
import java.util.Stack;

public class topologicalSort {
    public static ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> edges, int V, int e) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for(ArrayList<Integer> edge: edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            
            adj.get(u).add(v);
        }

        boolean[] visited = new boolean[adj.size()];
        for(int i = 0; i < V; i++) {
            if(!visited[i]) dfs(adj, i, stack, visited);
        }

        while(!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adj, int u, Stack<Integer> stack, boolean[] visited) {
        visited[u] = true;

        for(int v: adj.get(u)) {
            if(!visited[v]) dfs(adj, v, stack, visited);
        }

        stack.push(u);
    }  
}
