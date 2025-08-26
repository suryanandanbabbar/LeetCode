package Arrays;
// LeetCode Problem: 3000. Maximum Area of Longest Diagonal Rectangle
// Link: https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/

// TC: O(n)
// SC: O(1)

public class maxAreaLongestDiagRect {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxD = 0.0;
        int maxA = 0;

        for(int[] diagonal: dimensions) {
            int l = diagonal[0];
            int w = diagonal[1];

            double length = Math.sqrt((l * l) + (w * w));
            int area = l * w;

            if((length > maxD) || (length == maxD && area > maxA)) {
                maxD = length;
                maxA = area;
            }
        }

        return maxA;
    }
}
