package Dynamic_Programming;
// LeetCode Problem: 139. Word Break
// Link: https://leetcode.com/problems/word-break/description/

// TC: O(n^2 * m) 
// SC: O(n)
// where 'n' is the length of the string 's' and 'm' is the average length of words in 'wordDict'.

import java.util.HashSet;
import java.util.List;

public class wordBreak {
    public boolean word(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
