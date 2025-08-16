package Strings;
// LeetCode Problem: 1323. Maximum 69 Number
// Link: https://leetcode.com/problems/maximum-69-number/

// TC: O(n)
// SC: O(n)

public class max69Number {
    public int maximum69Number (int num) {
        char[] digits = String.valueOf(num).toCharArray();

        for(int i = 0; i < digits.length; i++) {
            if(digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(digits));
    }
}
