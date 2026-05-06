class Solution {
    public char[][] rotateTheBox(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        char[][] ans = new char[cols][rows];
        for (int r = 0; r < cols; r++)
            for (int c = 0; c < rows; c++)
                ans[r][c] = '.';

        for (int r = 0; r < rows; r++) {
            int p = cols - 1;
            for (int c = cols - 1; c >= 0; c--) {
                if (grid[r][c] == '*') {
                    ans[c][rows - 1 - r] = '*';
                    p = c - 1;
                } else if (grid[r][c] == '#')
                    ans[p--][rows - 1 - r] = '#';
            }
        }

        return ans;
    }
}