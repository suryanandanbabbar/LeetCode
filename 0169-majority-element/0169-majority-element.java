class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        n = n / 2;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > n) return entry.getKey();
        }

        return 0;
        
    }
}