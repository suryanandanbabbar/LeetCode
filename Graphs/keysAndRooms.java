package Graphs;
// LeetCode Problem: 841. Keys and Rooms
// Link: https://leetcode.com/problems/keys-and-rooms/description/

// TC: O(V + E)
// SC: O(V)

import java.util.List;

public class keysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, 0, visited);
        
        for (boolean roomVisited : visited) {
            if (!roomVisited) {
                return false; 
            }
        }
        
        return true; 
    }

    private void dfs(List<List<Integer>> rooms, int roomIndex, boolean[] visited) {
        visited[roomIndex] = true; 
        
        for (int key : rooms.get(roomIndex)) {
            if (!visited[key]) { 
                dfs(rooms, key, visited);
            }
        }
    }
}
