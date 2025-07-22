package Arrays;
// LeetCode Problem: 39. Combination Sum
// Link: https://leetcode.com/problems/combination-sum/

// TC: O(2^n)
// SC: O(k)

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public List<List<Integer>> combination(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        makeCombination(candidates, target, 0, new ArrayList<>(), 0, res);
        return res;
    }

    private void makeCombination(int[] candidates, int target, int idx, List<Integer> comb, int total,
            List<List<Integer>> res) {
        if (total == target) {
            res.add(new ArrayList<>(comb));
            return;
        }

        if (total > target || idx >= candidates.length) {
            return;
        }

        comb.add(candidates[idx]);
        makeCombination(candidates, target, idx, comb, total + candidates[idx], res);
        comb.remove(comb.size() - 1);
        makeCombination(candidates, target, idx + 1, comb, total, res);
    }
}
