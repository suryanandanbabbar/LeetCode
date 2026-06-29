package Graphs;

import java.util.*;

/*
You are given a map of a building, 
and your task is to count the number of its rooms. 
The size of the map is n \times m squares, and each square is either floor or wall.
You can walk left, right, up, and down through the floor squares.

Input
The first input line has two integers n and m: the height and width of the map.
Then there are n lines of m characters describing the map. 
Each character is either . (floor) or # (wall).

Output
Print one integer: the number of rooms.
*/

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = input.next();
            for (int j = 0; j < m; j++) {
                grid[i][j] = row.charAt(j);
            }
        }
        input.close();

        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == '.') {
                    count++;
                    dfs(i, j, grid);
                }
            }
        }
        System.out.println(count);
    }

    private static void dfs(int i, int j, char[][] grid) {
        if (i < 0 || i >= grid.length
                || j < 0 || j >= grid[0].length
                || grid[i][j] != '.') {
            return;
        }

        grid[i][j] = '#';

        dfs(i + 1, j, grid);
        dfs(i - 1, j, grid);
        dfs(i, j + 1, grid);
        dfs(i, j - 1, grid);
    }
}