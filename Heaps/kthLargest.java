package Heaps;
// LeetCode Problem: 215. Kth Largest Element in an Array
// Link: https://leetcode.com/problems/kth-largest-element-in-an-array/description/

// TC: O(N log K)
// SC: O(K)

import java.util.PriorityQueue;

public class kthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++) {
            p.add(nums[i]);
            if(p.size() > k) p.poll();
        }

        return p.peek();
    } 
}
