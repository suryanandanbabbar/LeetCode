package Bit_Manipulation;
// LeetCode Problem: 67. Add Binary
// Link: https://leetcode.com/problems/add-binary/

// TC: O(max(m, n)) 
// SC: O(max(m, n)) 

public class addBinary {
    public String addBin(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            result.append(sum % 2);
            carry = sum / 2;    
        }
        return result.reverse().toString();
    }
}
