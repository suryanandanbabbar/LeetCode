class Solution {
    public long gcdSum(int[] nums) {
        // O(n log n)
        int n = nums.length;
        // prefixGCD
        int[] prefixGCD = new int[n];
        int max = 0;

        // Build prefix array
        for(int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            prefixGCD[i] = gcd(nums[i], max);
        }

        // Sort in ascending order
        Arrays.sort(prefixGCD);
    
        // Form pairs (two -> two pointers)
        int left = 0;
        int right = n - 1;
        long sum = 0;

        while(left < right) {
            sum += gcd(prefixGCD[left], prefixGCD[right]);
            left++;
            right--;
        }
        return sum;
    }

    private int gcd(int a, int b) {
        if(b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }
}