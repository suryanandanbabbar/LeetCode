class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int left = 0, right = 0, result = 0;

        int[] count = new int[3];
        while(right < s.length()) {
            count[s.charAt(right) - 'a']++;
            while(count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += n - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return result;
    }
}