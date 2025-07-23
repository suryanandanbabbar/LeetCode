package Graphs;
// GfG: Detect Cycle in an Undirected Graph
// Link: https://www.geeksforgeeks.org/detect-cycle-in-an-undirected-

// TC: O(V + E)
// SC: O(V + E)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class undirectedGraphCycle {

    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[adj.size()];
        for (int i = 0; i < V; i++) {
            // Using BFS to detect cycle in an undirected graph
            if (!visited[i] && bfs(adj, i, visited))
                return true;

            // Using DFS to detect cycle in an undirected graph
            if(!visited[i] && dfs(adj, i, -1, visited))
                return true;
        }

        return false;
    }

    private boolean bfs(ArrayList<ArrayList<Integer>> adj, int node, boolean[] visited) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(node, -1));
        visited[node] = true;

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int src = p.node;
            int parent = p.parent;

            for (int v : adj.get(src)) {
                if (visited[v] == false) {
                    visited[v] = true;
                    q.add(new Pair(v, src));
                } else if (v != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(ArrayList<ArrayList<Integer>> adj, int u, int parent, boolean[] visited) {
        visited[u] = true;

        for (int v : adj.get(u)) {
            if (!visited[v]) {
                if (dfs(adj, v, u, visited)) return true;
            } else if (v != parent) {
                return true;
            }
        }
        return false;
    }

    class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }
}
