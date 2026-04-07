class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

        for(int[] interval : intervals) {
            int[] last = res.get(res.size() - 1);
            
            if(interval[0] <= last[1]) {
                last[1] = Math.max(last[1], interval[1]);
            } else {
                res.add(interval);
            }
        }

        return res.toArray(new int[res.size()][]);


    }
}