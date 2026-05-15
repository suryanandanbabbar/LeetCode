class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    dfs(i, j, grid, 2);
                }
            }
        }

        int count = 2;
        for(int[] r: grid) {
            for(int c: r) {
                if(c == 1) return - 1;
                count = Math.max(count, c);
            }
        }
        return count - 2;
    }

    private void dfs(int i, int j, int[][] grid, int temp) {
        if(i < 0 || j < 0
        || i >= grid.length 
        || j >= grid[0].length
        || grid[i][j] == 0
        || (grid[i][j] > 1 && grid[i][j] < temp))
            return;

        grid[i][j] = temp;

        dfs(i + 1, j, grid, temp + 1);
        dfs(i - 1, j, grid, temp + 1);
        dfs(i, j + 1, grid, temp + 1);
        dfs(i, j - 1, grid, temp + 1);
    }
}