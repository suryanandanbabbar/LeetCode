package Heaps;
// LeetCode Problem: 347. Top K Frequent Elements
// Link: https://leetcode.com/problems/top-k-frequent-elements/description/

// TC: O(N log K)
// SC: O(K)

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            result[i++] = pq.poll().getKey();
        }

        return result;
    }
}
