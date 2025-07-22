package Strings;
// LeetCode Problem: 6. ZigZag Conversion
// Link: https://leetcode.com/problems/zigzag-conversion/description/

// TC: O(n)
// SC: O(n)

class ZigZag {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numRows; i++) {
            for(int j = i; j < s.length(); j+= (2 * (numRows - 1))) {
                sb.append(s.charAt(j));
                if(i > 0 && i < numRows - 1 && j + (2 * (numRows - 1)) - (2 * i) < s.length()) {
                    sb.append(s.charAt(j + (2 * (numRows - 1)) - (2 * i)));
                } 
            }
        }
        return sb.toString();
    }
}