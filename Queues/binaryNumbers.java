package Queues;
// GFG: https://www.geeksforgeeks.org/problems/generate-binary-numbers-1587115620

// TC: O(n)
// SC: O(n)

import java.util.*;

public class binaryNumbers {
    static ArrayList<String> generate(int n) {
        // Uses Queue
        ArrayList<String> result = new ArrayList<>();
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("1"); 
        while (n-- > 0) {
            String current = queue.poll();
            result.add(current);
            queue.offer(current + "0");
            queue.offer(current + "1");
        }
        return result;
    }
}
