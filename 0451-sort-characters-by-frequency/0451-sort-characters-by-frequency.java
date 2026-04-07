class Solution {
    public String frequencySort(String s) {
        // Map -> Counts frequency (key: Character, value: Frequency)
        HashMap<Character, Integer> map = new HashMap<>();

        // 'tree'
        // [{e, 2}, {r, 1}, {t, 1}]
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Repeatedly pick the char with max freq
        StringBuilder result = new StringBuilder();

        while(!map.isEmpty()) {
            int max = 0;
            char ch = 0;

            // find max freq character
            for(Map.Entry<Character, Integer> entry: map.entrySet()) {
                if(entry.getValue() > max) {
                    max = entry.getValue();
                    ch = entry.getKey();
                }
            }

            // append it (freq) times
            for(int i = 0; i < max; i++) {
                result.append(ch);
            }

            // remove from map
            map.remove(ch);
        }
        
        return result.toString();
    }
}