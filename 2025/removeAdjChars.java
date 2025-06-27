// LeetCode Problem: 1047: Remove All Adjacent Duplicates In String
// Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()) {
            if(sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1); // Remove last character if it matches current
            } else {
                sb.append(c); // Otherwise, add current character
            }
        }
        return sb.toString(); // Return the final string without adjacent duplicates
    }
}
