import java.util.ArrayDeque;

public class removeOuterParentheses {
    public String remvString(String s) {
        // StringBuilder result = new StringBuilder();
        // int openCount = 0;

        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     if (c == '(') {
        //         if (openCount > 0) {
        //             result.append(c);
        //         }
        //         openCount++;
        //     } else if (c == ')') {
        //         openCount--;
        //         if (openCount > 0) {
        //             result.append(c);
        //         }
        //     }
        // }

        // return result.toString();

        // Using stack
        ArrayDeque<Character> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (!stack.isEmpty()) {
                    result.append(c);
                }
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
    
}
