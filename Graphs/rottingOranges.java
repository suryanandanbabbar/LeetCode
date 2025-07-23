package Graphs;
// LeetCode Problem: 994. Rotting Oranges
// Link: https://leetcode.com/problems/rotting-oranges/description/

// TC: O(m * n)
// SC: O(m * n)

import java.util.LinkedList;
import java.util.Queue;

public class rottingOranges {
    // Using Multi-source BFS
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0;
        int[][] visited = grid;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (visited[i][j] == 2)
                    q.offer(new int[] { i, j });
                if (visited[i][j] == 1)
                    fresh++;
            }
        }

        if (fresh == 0) return 0;
        if (q.isEmpty()) return -1;

        int timer = -1;
        int[][] d = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };

        while (!q.isEmpty()) {
            int size = q.size();
            
            while (size-- > 0) {
                int[] cell = q.poll();
                int x = cell[0];
                int y = cell[1];
                
                for (int[] dir : d) {
                    int i = x + dir[0];
                    int j = y + dir[1];
                    
                    if (i >= 0 && i < rows && j >= 0 && j < cols && visited[i][j] == 1) {
                        visited[i][j] = 2;
                        q.offer(new int[] { i, j });
                        fresh--;
                    }
                }
            }
            timer++;
        }

        return (fresh == 0) ? timer : -1;
    }

    // Using DFS
    public int orangesRottingDFS(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 2) {
                    dfs(grid, i, j, 2);
                }
            }
        }

        int timer = 2;
        for(int[] r: grid) {
            for(int c: r) {
                if(c == 1) return -1;
                timer = Math.max(timer, c);
            }
        }

        return timer - 2;
    }

    private void dfs(int[][] grid, int i, int j, int timer) {
        if(i < 0 || i >= grid.length
        || j < 0 || j >= grid[0].length
        || grid[i][j] == 0
        || (grid[i][j] > 1 && grid[i][j] < timer)) return;

        grid[i][j] = timer;

        dfs(grid, i + 1, j, timer + 1);
        dfs(grid, i - 1, j, timer + 1);
        dfs(grid, i, j + 1, timer + 1);
        dfs(grid, i, j - 1, timer + 1);
    }
}
