package Strings;
// LeetCode Problem: 3304. Kth Character in String Game I
// Link: https://leetcode.com/problems/find-the-k-th-character-in-string-game-i

// TC: O(1)
// SC: O(1)

class kthCharString {
    public char kthCharacter(int k) {
        return (char) ('a' + Integer.bitCount(k - 1));
    }
}