class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int ans = 0;
        for(int right = 0; right < n; right++) {
            int len = 0;
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(s.charAt(right));
            ans = Math.max(set.size(), ans);
        }

        return ans;
    }
}