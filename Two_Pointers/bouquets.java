package Two_Pointers;
// LeetCode Problem: 1482. Minimum Number of Days to Make m Bouquets
// Link: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

// TC: O(n log(max(bloomDay)))
// SC: O(1)

class bouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < (long) m * k) return -1;

        int left = 1, right = 1000000000;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeBouquets(bloomDay, mid, m, k)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left;
    }

    private boolean canMakeBouquets(int[] bloomDay, int day, int m, int k) {
        int count = 0, flowers = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    count++;
                    flowers = 0; 
                }
            } else {
                flowers = 0; 
            }
        }
        return count >= m; 
    }
}