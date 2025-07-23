package Graphs;
// LeetCode Problem: 542. 01 Matrix
// Link: https://leetcode.com/problems/01-matrix/description/

// TC: O(m * n)
// SC: O(m * n)

import java.util.Queue;
import java.util.LinkedList;

public class Matrix01 {
    // Using Multi-source BFS
    public int[][] updateMatrix(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        int rows = mat.length;
        int cols = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new int[] { i, j });
                    visited[i][j] = true;
                }
            }
        }

        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        int distance = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            distance++;

            while (size-- > 0) {
                int[] cell = q.poll();
                int x = cell[0];
                int y = cell[1];

                for (int[] dir : dirs) {
                    int i = x + dir[0];
                    int j = y + dir[1];

                    if (i >= 0 && i < rows && j >= 0 && j < cols && !visited[i][j]) {
                        visited[i][j] = true;
                        result[i][j] = distance;
                        q.offer(new int[] { i, j });
                    }
                }
            }
        }
        return result;
    }

    // Using DFS (Not Recommended)
    public int[][] updateMatrixDFS(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat[i][j] == 0 ? 0 : Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    dfs(mat, result, i + 1, j, 1);
                    dfs(mat, result, i - 1, j, 1);
                    dfs(mat, result, i, j + 1, 1);
                    dfs(mat, result, i, j - 1, 1);
                }
            }
        }

        return result;
    }

    private void dfs(int[][] mat, int[][] result, int i, int j, int dist) {
        if (i < 0 || i >= mat.length || j < 0 || j >= mat[0].length)
            return;

        if (result[i][j] <= dist)
            return; 

        result[i][j] = dist;

        dfs(mat, result, i + 1, j, dist + 1);
        dfs(mat, result, i - 1, j, dist + 1);
        dfs(mat, result, i, j + 1, dist + 1);
        dfs(mat, result, i, j - 1, dist + 1);
    }
}
