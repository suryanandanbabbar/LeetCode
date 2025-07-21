package Heaps;
// Code360: https://www.naukri.com/code360/problems/k-th-largest-sum-contiguous-subarray_920398

import java.util.PriorityQueue;

// TC: O(N log K)
// SC: O(K) for the priority queue

public class kthLargestSumSubarray {
    public int kthLargestSum(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                pq.add(sum);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }

        return pq.peek();
    }
}