package Two_Pointers;
// LeetCode Problem: 875. Koko Eating Bananas
// Link: https://leetcode.com/problems/koko-eating-bananas/

class kokoBananas {
    public boolean canEatAll(int[] piles, int speed, int h) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            // Calculate hours needed for this pile
            hoursNeeded += (pile + speed - 1) / speed; // Equivalent to Math.ceil(pile / speed)
        }
        return hoursNeeded <= h; // Check if within the allowed hours
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, mid, h)) {
                right = mid; // Try a smaller speed
            } else {
                left = mid + 1; // Increase speed
            }
        }

        return left; // Minimum speed found
    }
}
