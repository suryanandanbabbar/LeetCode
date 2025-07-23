package Graphs;
// LeetCode Problem: 130. Surrounded Regions
// Link: https://leetcode.com/problems/surrounded-regions/description/

// TC: O(m * n)
// SC: O(m * n)

public class surroundedRegions {
    public void solve(char[][] board) {
        if (board == null || board.length == 0)
            return;

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < cols; i++) {
            dfs(board, 0, i, rows, cols);
            dfs(board, rows - 1, i, rows, cols);
        }

        for (int i = 0; i < rows; i++) {
            dfs(board, i, 0, rows, cols);
            dfs(board, i, cols - 1, rows, cols);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == 'P')
                    board[i][j] = 'O';
            }
        }
    }

    private void dfs(char[][] board, int i, int j, int rowsSize, int colsSize) {
        if(i < 0 || i == rowsSize
        || j < 0 || j == colsSize
        || board[i][j] != 'O')
            return;

        board[i][j] = 'P';

        dfs(board, i + 1, j, rowsSize, colsSize);
        dfs(board, i - 1, j, rowsSize, colsSize);
        dfs(board, i, j + 1, rowsSize, colsSize);
        dfs(board, i, j - 1, rowsSize, colsSize);
    }
}
