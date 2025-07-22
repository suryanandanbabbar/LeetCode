package Two_Pointers;
// LeetCode Problem: 392. Is Subsequence
// Link: https://leetcode.com/problems/is-subsequence/description/

// TC: O(n)
// SC: O(1)

class isSubsequenceSolution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}

