class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(right < s.length()) {
            // window length
            int window = right - left + 1;

            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            // Max occurence
            int f = 0;
            for(int i : map.values()) f = Math.max(f, i);

            // window length - count[max occurring character] <= k
            // ans = right - left + 1
            if(window - f <= k) {
                ans = Math.max(ans, right - left + 1);
            }

            // window length - count[max occurring character] > k
            // decrement the frequency of the character from left
            // shrink the window -> left++;
            if(window - f > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            right++;
        }

        return ans;
    }
}