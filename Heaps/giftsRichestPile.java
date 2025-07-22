package Heaps;
// LeetCode Problem: 2558. Take Gifts From the Richest Pile
// Link: https://leetcode.com/problems/take-gifts-from-the-richest-pile/

// TC: O(k log N) 
// SC: O(N) 

import java.util.Collections;
import java.util.PriorityQueue;

public class giftsRichestPile {
    public long pickGifts(int[] gifts, int k) {
        // Max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        
        for(int i: gifts) pq.offer(i);

        while(k-- > 0) pq.add((int)Math.sqrt(pq.poll()));

        while(!pq.isEmpty()) sum += pq.poll();

        return sum;
    } 
}
