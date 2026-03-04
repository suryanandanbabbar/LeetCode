package Arrays;
// LeetCode Problem: 1582. Special Positions in a Binary Matrix
// Link: https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/

// TC: O(m * n)
// SC: O(1)

public class specialPosInBinaryMatrix {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int m = mat.length;
        int n = mat[0].length;

        int[] rows = new int[m];
        int[] cols = new int[n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 1 && rows[i] == 1 && cols[j] == 1) count++;
            }
        }
        
        return count;
    }
}