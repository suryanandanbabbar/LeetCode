package Stack;
// GfG: https://www.geeksforgeeks.org/problems/smallest-number-on-left3403

// TC: O(n)
// SC: O(n)
import java.util.ArrayDeque;

public class nextSmallerLeft {
    public int[] leftSmaller(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        int[] result = new int[n];
        
        for(int i = 0; i < n; i++) result[i] = -1;
        
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arr[i] <= stack.peek())
                stack.pop();
            if(!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        
        return result;
    }
}
