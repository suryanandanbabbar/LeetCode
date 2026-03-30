class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();

        int left = 0, right = 0, ans = 0;

        while(right < n) {
            // Length of the window
            int windowLength = right - left + 1;
            
            // Updating hashmap for the frequency
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            // Maximum Frequency
            int max = 0;
            for(int f: map.values()) max = Math.max(max, f);

            if(windowLength - max <= k) {
                ans = Math.max(ans, right - left + 1);
            }
            if(windowLength - max > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }

            right++;
        } 

        return ans;
    }
}