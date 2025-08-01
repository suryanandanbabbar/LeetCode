package Arrays;
// LeetCode Problem: 56. Merge Intervals
// Link: https://leetcode.com/problems/merge-intervals/

// TC: O(n log n)
// SC: O(n)

import java.util.*;

public class mergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int[] interval : intervals) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]) {
                ans.add(interval);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
