// LeetCode Problem: 205: Isomorphic Strings
// Link: https://leetcode.com/problems/isomorphic-strings/

class isomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        if(n1 != n2) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for(int i = 0; i < n1; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(freq1[c1] != freq2[c2]) return false;
            freq1[c1] = i + 1; 
            freq2[c2] = i + 1; 
        }
        return true;
    }
}