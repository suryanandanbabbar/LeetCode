package Graphs;
// GfG: Print Adjacency List
// Link: https://www.geeksforgeeks.org/problems/print-adjacency-list-1587115620/1

// TC: O(V + E) 
// SC: O(V + E) 

import java.util.ArrayList;
import java.util.List;

public class adjacencyList {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> list = new ArrayList<>(V);
        for(int i = 0; i < V; i++) 
            list.add(new ArrayList<Integer>());
        
        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            
            list.get(u).add(v);
            list.get(v).add(u);
        }
        
        return list;
    }
}
