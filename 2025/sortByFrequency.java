// Sorting characters by frequency
// Code360: https://www.naukri.com/code360/problems/sorting-characters-by-frequency_1263699

class Solution {
    public static String sortByFrequency(int n, String s) {
        // Counting the frequency of each character
        int[] freq = new int[256]; // Assuming ASCII characters
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Creating a list of characters sorted by frequency
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                for (int j = 0; j < freq[i]; j++) {
                    result.append((char) i);
                }
            }
        }

        return result.toString();
    }
}