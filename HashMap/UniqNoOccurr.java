package HashMap;
// 1207. Unique Number of Occurrences
// Link: https://leetcode.com/problems/unique-number-of-occurrences/

// TC: O(n)
// SC: O(n)

import java.util.*;

class UniqNoOccurr {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> frequencies = new HashSet<>();
        for (int freq : map.values()) {
            if (!frequencies.add(freq)) {
                return false;
            }
        }

        return true;
    }
}
