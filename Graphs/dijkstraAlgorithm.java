package Graphs;
// GfG: Dijkstra's Algorithm for Shortest Path
// Link: https://www.geeksforgeeks.org/dijkstras-shortest-path-al

// TC: O(E log V)
// SC: O(V + E)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Arrays;

public class dijkstraAlgorithm {
    public int[] dijkstra(int V, int[][] edges, int source) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.get(0)));
        
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for(int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            ArrayList<Integer> edge1 = new ArrayList<>();
            edge1.add(v);
            edge1.add(w);
            adj.get(u).add(edge1);

            ArrayList<Integer> edge2 = new ArrayList<>();
            edge2.add(u);
            edge2.add(w);
            adj.get(v).add(edge2);
        }

        dist[source] = 0;
        ArrayList<Integer> start = new ArrayList<>();
        start.add(0);
        start.add(source);
        pq.offer(start);

        while(!pq.isEmpty()) {
            ArrayList<Integer> current = pq.poll();
            int u = current.get(1); 
            
            for(ArrayList<Integer> neighbour: adj.get(u)) {
                int v = neighbour.get(0);
                int weight = neighbour.get(1);

                if(dist[v] > dist[u] + weight) {
                    dist[v] = dist[u] + weight;

                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(dist[v]);
                    temp.add(v);
                    pq.offer(temp);
                }
            }
        }

        return dist;
    }
}
