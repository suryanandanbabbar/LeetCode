package Queues;
// LeetCode Problem: 2014. Longest Substring With K Repeating Characters
// Link: https://leetcode.com/problems/longest-substring-with-k-repeating-characters

// TC: O(n * k)
// SC: O(n)

import java.util.LinkedList;
import java.util.Queue;

class longestSubsKTimes {
    public String longestSubsequenceRepeatedK(String s, int k) {
        String r="";
        Queue<String> q=new LinkedList<>();
        for(q.add("");!q.isEmpty();) {
            String c=q.poll();
            for(char ch='a';ch<='z';ch++) {
                String n=c+ch;
                if(isK(n,s,k)) {
                    r=n;
                    q.add(n);
                }
            }
        }
        return r;
    }
    boolean isK(String s,String t,int k) {
        int c=0,i=0;
        for(char ch:t.toCharArray()) {
            if(ch==s.charAt(i)) {
                if(++i==s.length()) {
                    i=0;
                    if(++c==k) return true;
                }
            }
        }
        return false;
    }
}