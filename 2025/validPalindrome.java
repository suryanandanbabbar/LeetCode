// LeetCode Problem: 125. Valid Palindrome
// Link: https://leetcode.com/problems/valid-palindrome/

class validPalindrome {
    public boolean isPalindrome(String s) {
        // s = s.toLowerCase();
        // StringBuilder sb = new StringBuilder();

        // for(int i = 0; i < s.length(); i++) {
        //     if(Character.isLetterOrDigit(s.charAt(i))) {
        //         sb.append(s.charAt(i));
        //     }
        // }

        // String original = sb.toString();
        // String reversed = sb.reverse().toString();

        // return original.equals(reversed);

        // Using Two Pointer Approach
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", ""); // Remove non-alpha
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
