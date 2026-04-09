class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
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

    private void dfs(int i, int j, int[][] grid, int count) {
        if(i < 0 || i >= grid.length 
        || j < 0 || j >= grid[0].length 
        || grid[i][j] == 0 
        || (grid[i][j] > 1 && grid[i][j] < count)) return;

        grid[i][j] = count;

        dfs(i + 1, j, grid, count + 1);
        dfs(i - 1, j, grid, count + 1);
        dfs(i, j + 1, grid, count + 1);
        dfs(i, j - 1, grid, count + 1);
    }
}