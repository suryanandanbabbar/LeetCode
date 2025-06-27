// Sorting characters by frequency
// Code360: https://www.naukri.com/code360/problems/sorting-characters-by-frequency_1263699
// LeetCode: https://leetcode.com/problems/sort-characters-by-frequency/description/
import java.util.*;

class Solution {
    public static String sortByFrequency(int n, String s) {
        // // Counting the frequency of each character
        // int[] freq = new int[256]; // Assuming ASCII characters
        // for (char c : s.toCharArray()) {
        //     freq[c]++;
        // }

        // // Creating a list of characters sorted by frequency
        // StringBuilder result = new StringBuilder();
        // for (int i = 0; i < 256; i++) {
        //     if (freq[i] > 0) {
        //         for (int j = 0; j < freq[i]; j++) {
        //             result.append((char) i);
        //         }
        //     }
        // }

        // return result.toString();

        // LeetCode Solution:
        int[] freq = new int[128];
        StringBuilder result = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();
        
        for(char c: s.toCharArray()) {
            freq[c]++;
        }

        for(char i = 0; i < 128; i++) {
            if(freq[i] > 0) {
                list.add(i);
            }
        }
        list.sort((a, b) -> freq[b] - freq[a]);
        
        for(char c: list) {
            for(int i = 0; i < freq[c]; i++)
                result.append(c);
        }

        return result.toString();
    }
}