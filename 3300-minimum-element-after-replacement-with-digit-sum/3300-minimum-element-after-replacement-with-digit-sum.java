class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i: nums) {
            int sum = 0;
            while(i != 0) {
                int digit = i % 10;
                sum += digit;
                i /= 10;
            }
            list.add(sum);
        }
        
        int min = Integer.MAX_VALUE;
        for(int i : list) {
            if(i < min) min = i;
        }
        
        return min;
    }
}