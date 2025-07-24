package Graphs;
// LeetCode Problem: 797. All Paths From Source to Target
// Link: https://leetcode.com/problems/all-paths-from-source-to-target/

// TC: O(2^N) 
// SC: O(N) 

import java.util.*;

public class allPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0); 
        dfs(graph, 0, path, result);
        return result;
    }

    private void dfs(int[][] graph, int u, List<Integer> path, List<List<Integer>> result) {
        if (u == graph.length - 1) { 
            result.add(new ArrayList<>(path)); 
            return;
        }

        for (int v : graph[u]) { 
            path.add(v); 
            dfs(graph, v, path, result); 
            path.remove(path.size() - 1); 
        }
    }
    
}
