package Graphs;
// LeetCode Problem: 207. Course Schedule
// Link: https://leetcode.com/problems/course-schedule/description/

// TC: O(V + E)
// SC: O(V + E)

// Same as directedGraphCycle.java, but with a different context
import java.util.ArrayList;

public class courseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[numCourses];
        boolean[] inRecursion = new boolean[numCourses];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<Integer>());
        }   

        for(int [] edge: prerequisites) {
            int u = edge[0];
            int v = edge[1];
            adj.get(v).add(u); 
        }

        for(int i = 0; i < numCourses; i++) {
            if(!visited[i]) {
                if(dfs(adj, i, visited, inRecursion)) {
                    return false; 
                }
            }
        }
        return true;
    }

    private boolean dfs(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, boolean[] inRecursion) {
        visited[u] = true;
        inRecursion[u] = true;

        for(int v: adj.get(u)) {
            if(!visited[v]) {
                if(dfs(adj, v, visited, inRecursion)) {
                    return true; 
                }
            } else if(inRecursion[v]) {
                return true; 
            }
        }

        inRecursion[u] = false;
        return false; 
    }
}