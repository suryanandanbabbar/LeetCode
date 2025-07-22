package Heaps;
// GfG: Does Array Represent Heap?
// Link: https://www.geeksforgeeks.org/problems/does-array-represent-heap4345/1

// TC: O(N)
// SC: O(1)

public class arrayHeap {
    public boolean countSub(long arr[], long n) {
        if(n == 0 || n == 1) return true;

        for(long i = 0; i < n / 2; i++) {
            long left = 2 * i + 1;
            long right = 2 * i + 2;

            if(left < n && arr[(int)i] < arr[(int)left]) return false;
            if(right < n && arr[(int)i] < arr[(int)right]) return false;
        }

        return true;        
    }
}
