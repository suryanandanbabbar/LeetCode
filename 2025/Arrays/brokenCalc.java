package Arrays;
// LeetCode Problem: 991. Broken Calculator
// Link: https://leetcode.com/problems/broken-calculator/

// TC: O(log(target/startValue))
// SC: O(1)

public class brokenCalc {
    // Iterative Approach
    public int brokenCalIterative(int startValue, int target) {
        int result = 0;

        while(startValue < target) {
            if(target % 2 == 0) target /= 2;
            else target++;
            result++;
        }

        return result + (startValue - target);
    }
    
    // Recursive Approach
    public int brokenCalcRecursive(int startValue, int target) {
        if(startValue >= target) return startValue - target;
        if(target % 2 == 0) return 1 + brokenCalcRecursive(startValue, target / 2);
        else return 1 + brokenCalcRecursive(startValue, target + 1);
    }
}
