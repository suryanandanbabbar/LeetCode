package Arrays;
// LeetCode Problem: 1404. Number of Steps to Reduce a Number in Binary Representation to One
// Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/description/?envType=daily-question&envId=2026-02-26

class Solution {
    public int numSteps(String s) {
        int steps = 0, carry = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            if ((s.charAt(i) & 1) + carry == 1) {
                steps += 2;
                carry = 1;
            } else
                steps += 1;
        }

        return steps + carry;
    }
}