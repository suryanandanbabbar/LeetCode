package Heaps;
// GfG: https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1

// TC: O(N log N)
// SC: O(N) for the priority queue

import java.util.PriorityQueue;

public class minCostOfRopes {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        int cost = 0;
        
        for(int i : arr) p.add(i);
        
        while(p.size() > 1) {
            int val1 = p.poll();
            int val2 = p.poll();
            int current = val1 + val2;
            p.add(current);
            cost += current;
        }
        
        return cost;
    }
}
