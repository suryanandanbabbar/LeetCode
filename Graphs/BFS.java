package Graphs;
// GfG: BFS Traversal of Graph
// Link: https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

// TC: O(V + E) 
// SC: O(V + E) 

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[adj.size() + 1];
        
        q.add(0);
        visited[0] = 1;
        
        while(!q.isEmpty()) {
            int node = q.poll();
            result.add(node);
            
            for(int i : adj.get(node)) {
                if(visited[i] != 1) {
                    visited[i] = 1;
                    q.offer(i);
                }
            }
        }
        return result;
        
    }
}
