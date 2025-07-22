package Heaps;
// GfG: Merge Two Binary Max Heaps
// Link: https://www.geeksforgeeks.org/problems/merge-two-binary-max-heap0144/1

// TC: O((N + M) log(N + M))
// SC: O(N + M) 

import java.util.Collections;
import java.util.PriorityQueue;

public class mergeHeaps {
    public int[] merge(int[] a, int[] b, int n, int m) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : a) pq.add(i);
        for(int i : b) pq.add(i);
        
        
        int size = pq.size();
        int[] result = new int[size];
        for(int i = 0; i < size; i++)
            result[i] = pq.poll();
            
        return result;
    }
    
}
