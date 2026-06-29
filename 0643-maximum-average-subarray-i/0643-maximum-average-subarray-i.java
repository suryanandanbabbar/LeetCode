class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = 0, sum = 0;
        double ans = Double.NEGATIVE_INFINITY;

        if(n == 1) return nums[0];

        while(right < n) {
            sum += nums[right];
            
            if(right - left + 1 == k) {
                double avg = (double) sum / k;
                ans = Math.max(ans, avg);
                sum -= nums[left];
                left++;
            }
            right++;
        }

        return ans;
    }
}