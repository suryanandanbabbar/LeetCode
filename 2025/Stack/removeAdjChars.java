package Stack;
// LeetCode Problem: 1047: Remove All Adjacent Duplicates In String
// Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

import java.util.Stack;
class removeAdjChars {
    public String removeDuplicates(String s) {
        // StringBuilder sb = new StringBuilder();

        // for(char c: s.toCharArray()) {
        //     if(sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
        //         sb.deleteCharAt(sb.length() - 1); // Remove last character if it matches current
        //     } else {
        //         sb.append(c); // Otherwise, add current character
        //     }
        // }
        // return sb.toString(); // Return the final string without adjacent duplicates

        // Using Stack
        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray()) {
            if(!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }
}
