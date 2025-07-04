// LeetCode Problem: 1358: Number of Substrings Containing All Three Characters
// Link: https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/

public class noOfSubstrings {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] count = new int[3];
        int left = 0, right = 0, result = 0;

        while (right < n) {
            count[s.charAt(right) - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += n - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return result;
    }
}
