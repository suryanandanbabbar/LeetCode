package Arrays;
// LeetCode Problem: 435. Non-overlapping Intervals
// Link: https://leetcode.com/problems/non-overlapping-intervals/

// TC: O(n log n)
// SC: O(1)

import java.util.Arrays;

public class nonOverlappingArrays {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int prev = 0;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= intervals[prev][1]) {
                prev = i;
                count++;
            }
        }
        return n - count;
    }
}
