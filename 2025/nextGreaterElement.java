// GfG: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620

// TC: O(n)
// SC: O(n)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class nextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(arr.length, -1));
        
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            } if(!stack.isEmpty()) {
                result.set(i, stack.peek());
            }
            stack.push(arr[i]);
        }
        
        return result;
    }
}
