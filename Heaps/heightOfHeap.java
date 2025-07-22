package Heaps;
// GfG: Height of Heap
// Link: https://www.geeksforgeeks.org/problems/height-of-heap5025/1

// TC: O(log N)
// SC: O(1)

public class heightOfHeap {
    static int heapHeight(int n, int arr[]) {
        if (n == 1) return 1;

        int height = 0;
        while (n > 1) {
            height++;
            n /= 2; 
        }
        return height; 
    }
}
