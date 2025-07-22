package Heaps;
// Code360: K-th Largest Sum Contiguous Subarray
// Link: https://www.naukri.com/code360/problems/k-th-largest-sum-contiguous-subarray_920398

// TC: O(N^2 log K)
// SC: O(K) 

import java.util.PriorityQueue;

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