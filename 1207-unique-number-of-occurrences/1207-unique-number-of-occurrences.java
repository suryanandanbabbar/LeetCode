class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i: arr) 
            map.put(i, map.getOrDefault(i, 0) + 1);
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int value = entry.getValue();

            if(set.contains(value)) return false;
            set.add(value);
        }
        return true;
    }       
}   