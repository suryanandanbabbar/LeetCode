class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            int num = nums[i];
            ArrayList<Integer> temp = new ArrayList<>();

            while(num != 0) {
                int digit = num % 10;
                temp.add(digit);
                num = num / 10;
            }

            Collections.reverse(temp);
            
            for(int j = 0; j < temp.size(); j++) {
                list.add(temp.get(j));
            }
        }

        int s = list.size();
        int[] ans = new int[s];
        for(int i = 0; i < s; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}