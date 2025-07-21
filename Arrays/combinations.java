package Arrays;
// LeetCode Problem: 77. Combinations
// Link: https://leetcode.com/problems/combinations/

import java.util.ArrayList;
import java.util.List;

public class combinations {
    void solve(List<Integer> curr, List<List<Integer>> ans, int start, int n, int k) {
        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i <= n; i++) {
            curr.add(i);
            solve(curr, ans, i + 1, n, k);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(new ArrayList<>(), ans, 1, n, k);
        return ans;
    }
}
