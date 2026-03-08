package Strings;
// LeetCode Problem: 1980. Find Unique Binary String
// Link: https://leetcode.com/problems/find-unique-binary-string/description/

// TC: O(n)
// SC: O(1)

public class findUniqBinString {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        char[] ans = new char[n];
        
        for (int i = 0; i < n; i++)
            ans[i] = nums[i].charAt(i) == '0' ? '1' : '0';
        return new String(ans);
    }
}
