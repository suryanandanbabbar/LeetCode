class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        
        // minimum capacity -> max (weights)
        int l = 0;
        int h = 0;
        for(int w: weights) {
            l = Math.max(w, l);
            h += w;
        }

        // [1,2,3,4,5,6,7,8,9,10]
        // [T,T,T,T,T],[T,T],[T],[T],[T]
        // [15]
        // 15 + 6 > 15 
        // 6 + 7 = 13
        // 8 
        // 9
        // 10

        while(l < h) {
            int mid = l + (h - l) / 2;
            if(solve(weights, mid, days)) h = mid;
            else l = mid + 1;
        }
    

        // maximum possible capacity -> sum (weights)

        // capacity & days
        return l;
    }

    private boolean solve(int[] arr, int cap, int days) {
        // required days
        int req = 1;
        int curr = 0;

        for(int i: arr) {
            // current load + weight[i] > capacity
            if(curr + i > cap) {
                // req++
                req++;
                curr = 0;
            }
            // current load += weight
            curr += i;
        }
        // required days <= days
        return req <= days;
    }
}