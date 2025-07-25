package Graphs;
// Code360: Shortest Path in Undirected Graph
// Link: https://www.naukri.com/code360/problems/shortest-path-in-an-unweighted-graph_981297?leftPanelTabValue=PROBLEM

// TC: O(V + E)
// SC: O(V + E)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class shortestPathUndirectedGraph {
    public static LinkedList<Integer> shortestPath(int[][] edges, int n, int m, int s, int t) {
		boolean[] visited = new boolean[n + 1];
		int[] parent = new int[n + 1];
		Queue<Integer> q = new LinkedList<>();

		List<List<Integer>> adj = new ArrayList<>(n + 1);

		for(int i = 0; i <= n; i++) adj.add(new ArrayList<Integer>());

		for(int[] edge: edges) {
			int u = edge[0];
			int v = edge[1];

			adj.get(u).add(v);
			adj.get(v).add(u);
		}

		for(int i = 0; i < visited.length; i++) visited[i] = false;
		for(int i = 0; i < parent.length; i++) parent[i] = -1;

		q.offer(s);
		visited[s] = true;
		while(!q.isEmpty()) {
			int node = q.poll();

			for(int v: adj.get(node)) {
				if(!visited[v]) {
					visited[v] = true;
					parent[v] = node; 
					q.offer(v);
				}
			}
		}

		LinkedList<Integer> result = new LinkedList<>();
        if (!visited[t]) {
            return result;
        }

        for (int i = t; i != -1; i = parent[i]) {
            result.addFirst(i);
        }

        return result;

	} 
}
