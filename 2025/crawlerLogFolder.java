// LeetCode Problem: 1598. Crawler Log Folder
// Link: https://leetcode.com/problems/crawler-log-folder/

import java.util.ArrayDeque;

public class crawlerLogFolder {
    // Brute Force Approach
    // TC: O(n)
    // SC: O(1)
    public int minOperations(String[] logs) {
        int depth = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            } else if (!log.equals("./")) {
                depth++;
            }
        }

        return depth;
    }

    // Using stack 
    // TC: O(n)
    // SC: O(n)
    public int minOperationsStack(String[] logs) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String log : logs) {
            if (log.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!log.equals("./")) {
                stack.push(log);
            }  
        }
        return stack.size();
    }
}
