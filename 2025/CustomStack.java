// LeetCode Probllem: 1381. Design a Stack With Increment Operation
// Link: https://leetcode.com/problems/design-a-stack-with-increment-operation/

// TC: O(n)
// SC: O(n)

import java.util.ArrayList;

public class CustomStack {
    
    int maxSize = 0;
    ArrayList<Integer> list = new ArrayList<>();

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(list.size() < maxSize) list.add(x);
        else return;
    }
    
    public int pop() {
        if(list.isEmpty()) return -1;
        else return list.removeLast();
    }
    
    public void increment(int k, int val) {
        if(k <= list.size()) {
            for(int i = 0; i < k; i++) {
                list.set(i, list.get(i) + val);
            }
        } else {
            for(int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) + val);
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */

