package Strings;
// LeetCode Problem: 3335. Total Characters in String After Transformations
// Link: https://leetcode.com/problems/total-characters-in-string-after-transformations-i/

// TC: O(t * n)
// SC: O(1)

class SolTotalCharsInStringution {
    public int lengthAfterTransformations(String s, int t) {
        final int MOD = 1_000_000_007;
        long[] freq = new long[26];

        // Counting initial characters
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        while (t-- > 0) {
            long[] next = new long[26];
            for (int i = 0; i < 25; i++) {
                next[i + 1] = (next[i + 1] + freq[i]) % MOD;
            }
            // Special case for 'z'
            next[0] = (next[0] + freq[25]) % MOD;
            next[1] = (next[1] + freq[25]) % MOD;

            freq = next;
        }

        long total = 0;
        for (long count : freq) {
            total = (total + count) % MOD;
        }

        return (int) total;
    }
}
