class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for(int n: piles) right = Math.max(right, n);

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(solve(piles, mid, h)) right = mid;
            else left = mid + 1;
        }

        return left;
    }

    private boolean solve(int[] piles, int speed, int h) {
        int ans = 0;
        for(int p: piles) ans += (p + speed - 1) / speed;
        return ans <= h;
    }
}