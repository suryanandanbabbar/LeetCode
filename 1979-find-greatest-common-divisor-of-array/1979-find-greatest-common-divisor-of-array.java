class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i: nums) if(i > max) max = i;
        for(int i: nums) if(i < min) min = i;

        return gcd(max, min);
    }

    private int gcd(int a, int b) {
        if(b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }
}