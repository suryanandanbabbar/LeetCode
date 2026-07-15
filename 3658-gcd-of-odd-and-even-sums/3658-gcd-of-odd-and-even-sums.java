class Solution {
    private int even(int n) {
        int sum = 0;
        int i = 0;
        while(n != 0) {
            if(i % 2 == 0) {
                sum += i;
                n--;
            }
            i++;
        }
        return sum;
    }

    private int odd(int n) {
        int sum = 0;
        int i = 0;
        while(n != 0) {
            if(i % 2 != 0) {
                sum += i;
                n--;
            }
            i++;
        }
        return sum;
    }
    
    private int gcd(int a, int b) {
        if(b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    public int gcdOfOddEvenSums(int n) {
        return gcd(even(n), odd(n));
    }
}