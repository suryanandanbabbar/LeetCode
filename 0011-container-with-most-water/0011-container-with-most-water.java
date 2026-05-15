class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0, j = n - 1, area = 0;
        
        while(i < n && j >= 0) {
            int temp = (j - i) * Math.min(height[i], height[j]);
            area = Math.max(temp, area);
            if(height[i] < height[j]) i++;
            else j--;
        }

        return area;
    }
}