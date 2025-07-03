// LeetCode Problem: 3304. Kth Character in String Game I
// Link: https://leetcode.com/problems/find-the-k-th-character-in-string-game-i

class Solution {
    public char kthCharacter(int k) {
        return (char) ('a' + Integer.bitCount(k - 1));
    }
}