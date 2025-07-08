// Code360: https://www.naukri.com/code360/problems/next-greater-element_1112581

// TC: O(n)
// SC: O(n)

import java.util.*;

public class nextSmallerRight {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++)
            result.add(-1);

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr.get(i) <= stack.peek())
                stack.pop();
            if (!stack.isEmpty())
                result.set(i, stack.peek());
            stack.push(arr.get(i));
        }

        return result;

    }
}
