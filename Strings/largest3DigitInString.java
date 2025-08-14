package Strings;
// LeetCode Problem: 2264. Largest 3-Digit Number in a String
// Link: https://leetcode.com/problems/largest-3-digit-number-in-a-string

// TC: O(n)
// SC: O(1)

public class largest3DigitInString {
    public String largestGoodInteger(String num) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= num.length() - 3; i++) {
            String sub = num.substring(i, i + 3);

            for (int j = 1; j < sub.length(); j++) {
                if (sub.charAt(j) != sub.charAt(j - 1)) {
                    sub = "";
                    break;
                }
            }

            if (sub.length() != 0 && result.length() == 3) {
                int val1 = Integer.parseInt(result.toString());
                int val2 = Integer.parseInt(sub);

                if (val2 > val1) {
                    result = new StringBuilder(sub);
                }
            }

            else if (result.length() == 0 && sub.length() != 0) {
                result.append(sub);
            }
        }

        return result.toString();
    }
}
