package Arrays;
// LeetCode Problem: 90. Subsets II
// Link: https://leetcode.com/problems/subsets-ii/

// TC: O(n^2 log n)
// SC: O(n^2)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : nums) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                if (!outer.contains(internal)) {
                    outer.add(internal);
                }
            }
        }

        return outer;
    }
}
