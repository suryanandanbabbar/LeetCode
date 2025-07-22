package Heaps;
// GfG: Sum of Elements Between K1th and K2th Smallest Elements
// Link: https://www.geeksforgeeks.org/problems/sum-of-elements-between-k1th-and-k2th-smallest-elements3133/1

// TC: O(N long N)
// SC: O(N)

import java.util.PriorityQueue;

public class sumK1K2Smallest {
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
        if (K1 > K2 || K1 < 1 || K2 > N) return 0;

        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (long num : A) {
            minHeap.add(num);
        }

        long sum = 0;
        for (long i = 1; i <= K2; i++) {
            long current = minHeap.poll();
            if (i > K1 && i < K2) {
                sum += current;
            }
        }
        return sum;
    }
}
