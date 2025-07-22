package Heaps;
// GfG: Merge K Sorted Arrays
// Link: https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/1

// TC: O(N log K)
// SC: O(N)

import java.util.*;

public class mergeKSortedArrays {
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < arr[i].length; j++)
                p.add(arr[i][j]);
        }

        while (!p.isEmpty())
            result.add(p.poll());

        return result;
    }
}
