package Strings;
// LeetCode Problem: 1328. Break a Palindrome
// Link: https://leetcode.com/problems/break-a-palindrome/

// TC: O(n)
// SC: O(n)

public class breakPalindrome {
    public String breakPal(String palindrome) {
        StringBuilder result = new StringBuilder(palindrome);

        if (palindrome.length() == 1) return "";

        int i = 0, j = palindrome.length() - 1;
        while (i < j) {
            if (palindrome.charAt(i) != 'a') {
                result.setCharAt(i, 'a');
                return result.toString();
            }
            i++;
            j--;
        }
        result.setCharAt(result.length() - 1, 'b');
        return result.toString();
    }
}
