package Strings;
// LeetCode Problem: 451. Sort Characters By Frequency

// Link: https://leetcode.com/problems/sort-characters-by-frequency/description/

// TC: O(n log n) 
// SC: O(n) 

import java.util.*;

class sortByFrequencySolution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        StringBuilder result = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        for (char i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                list.add(i);
            }
        }
        list.sort((a, b) -> freq[b] - freq[a]);

        for (char c : list) {
            for (int i = 0; i < freq[c]; i++)
                result.append(c);
        }

        return result.toString();
    }
}
