package Heaps;
// LeetCode Problem: 1046. Last Stone Weight
// Link: https://leetcode.com/problems/last-stone-weight/description/

// TC: O(N log N)
// SC: O(N) for the priority queue

import java.util.PriorityQueue;

public class lastStoneWeight {
    public int lastStone(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i : stones) {
            pq.add(i);
        }

        while (pq.size() > 1) {
            int val1 = pq.poll();
            int val2 = pq.poll();
            if (val1 > val2)
                pq.add(val1 - val2);
        }
        
        return pq.isEmpty() ? 0 : pq.peek();
    }
}