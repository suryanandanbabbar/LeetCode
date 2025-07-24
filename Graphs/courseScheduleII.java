package Graphs;
// LeetCode Problem: 210. Course Schedule II
// Link: https://leetcode.com/problems/course-schedule-ii/description/

// TC: O(V + E)
// SC: O(V + E)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class courseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] indegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for(int[] edge: prerequisites) {
            int u = edge[0];
            int v = edge[1];

            adj.get(v).add(u);
            indegree[u]++;
        }

        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) q.offer(i);
        }

        while(!q.isEmpty()) {
            int node = q.poll();
            result.add(node);

            for(int v: adj.get(node)) {
                indegree[v]--;
                if(indegree[v] == 0) q.offer(v);
            }
        }

        if(result.size() == numCourses) {
            int[] order = new int[result.size()];
            for(int i = 0; i < result.size(); i++) 
                order[i] = result.get(i);
            return order;
        } else return new int[0];
    }
}
