class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr) 
            map.put(i, map.getOrDefault(i, 0) + 1);

        // 1 -> 3
        // 2 -> 2
        // 3 -> 1

        HashSet<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(set.contains(e.getValue())) return false;
            set.add(e.getValue());
        }

        return true;
    }
}