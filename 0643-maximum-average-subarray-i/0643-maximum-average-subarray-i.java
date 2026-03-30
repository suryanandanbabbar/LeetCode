class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int maxSum = 0;
        for(int i = 0; i <= n - k; i++) {
            int sum = 0;
            for(int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return (double) maxSum / k;

    }
}