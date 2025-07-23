package Graphs;
// LeetCode Problem: 994. Rotting Oranges
// Link: https://leetcode.com/problems/rotting-oranges/description/

// TC: O(m * n)
// SC: O(m * n)

import java.util.LinkedList;
import java.util.Queue;

public class rottingOranges {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        int[][] visited = grid;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 2)
                    q.offer(new int[] { i, j });
                if (visited[i][j] == 1)
                    fresh++;
            }
        }

        if (fresh == 0)
            return 0;
        if (q.isEmpty())
            return -1;

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
                    if (i >= 0 && i < m && j >= 0 && j < n && visited[i][j] == 1) {
                        visited[i][j] = 2;
                        fresh--;
                        q.offer(new int[] { i, j });
                    }
                }
            }
            timer++;
        }

        if (fresh == 0)
            return timer;
        return -1;
    }
}
