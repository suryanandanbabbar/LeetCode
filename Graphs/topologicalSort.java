package Graphs;
// GfG: Topological Sort
// Link: https://www.geeksforgeeks.org/problems/topological-sort/1

// TC: O(V + E)
// SC: O(V + E)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class topologicalSort {
    // Using DFS
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

    // Using Kahn's Algorithm (BFS)
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] inDegree = new int[V];
        
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        
        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            inDegree[v]++;
        }
        
        for(int i = 0; i < V; i++) {
            if(inDegree[i] == 0) {
                q.offer(i);
            }
        }
        
        while(!q.isEmpty()) {
            int node = q.poll();
            result.add(node);
            
            for(int v: adj.get(node)) {
                inDegree[v]--;
                if(inDegree[v] == 0) {
                    q.offer(v);
                }
            }
        }

        // Optional check for cycle
        // return result.size() != V ? true : false;
        // True - No cycle, False - Cycle exists
        
        return result;
    }
}
