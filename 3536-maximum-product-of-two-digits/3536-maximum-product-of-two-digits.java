class Solution {
    public int maxProduct(int n) {
        if(n <= 9) return n;
        
        int a = 0, b = 0;
        while(n > 0) {
            int curr = n % 10;
            if(curr > a) {
                b = a;
                a = curr;
            } else if(curr > b) b = curr;

            n /= 10;
        }

        return b * a;
    }
}