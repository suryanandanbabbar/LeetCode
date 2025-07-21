package Heaps;
// Code360: https://www.naukri.com/code360/problems/magician-and-chocolates_920437

// TC: O(N log N)
// SC: O(N) for the priority queue

import java.util.Collections;
import java.util.PriorityQueue;

public class magicianChocolates {
    public int maxChocolates(int[] chocolates, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;

        for(int i: chocolates) {
            pq.add(i);
        }

        for(int i = 0; i < k; i++) {
            if(pq.isEmpty()) break;

            int chocos = pq.poll();
            sum += chocos;

            pq.add(chocos / 2);
        }

        return sum;
    }    
}
