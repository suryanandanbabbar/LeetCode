package Strings;
// LeetCode Problem: 1888. Minimum Number of Flips to Make the Binary String Alternating
// Link: https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/description/

// TC: O(n)
// SC: O(1)

class minFlipsMakeBinStringAlt {
    public int minFlips(String s) {
        int n = s.length();
        int ans = n;

        int[] op = {0, 0};
        for (int i = 0; i < n; i++)
            op[(s.charAt(i) ^ i) & 1]++;

        for (int i = 0; i < n; i++) {
            op[(s.charAt(i) ^ i) & 1]--;
            op[(s.charAt(i) ^ (n + i)) & 1]++;
            ans = Math.min(ans, Math.min(op[0], op[1]));
        }

        return ans;
    }
}