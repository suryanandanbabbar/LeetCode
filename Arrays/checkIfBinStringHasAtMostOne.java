package Arrays;
// LeetCode Problem: 1784. Check if Binary String Has at Most One Segment of Ones
// Link: https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/

// TC: O(n)
// SC: O(1)

public class checkIfBinStringHasAtMostOne {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
