package Heaps;
// GfG: https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1

// TC: O(N log K)
// SC: O(K) for the priority queue

import java.util.PriorityQueue;
import java.util.Collections;

public class kthSmallest {
    public int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < nums.length; i++) {
            p.add(nums[i]);
            if(p.size() > k) p.poll();
        }

        return p.peek();
    }
    
}
