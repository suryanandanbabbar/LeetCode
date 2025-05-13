/* 
6: ZigZag Conversion

The string "PAYPALISHIRING" is written in a zigzag pattern 
on a given number of rows like this: 

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"
*/

class Solution {
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