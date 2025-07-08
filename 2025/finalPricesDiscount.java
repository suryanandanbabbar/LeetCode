// LeetCode Problem: 1475. Final Prices With a Special Discount in a Shop
// Link: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a

import java.util.ArrayDeque;

public class finalPricesDiscount {
    public int[] finalPrices(int[] prices) {

        // Brute Force Approach
        // Time Complexity: O(n^2)
        // Space Complexity: O(n)
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            answer[i] = prices[i];
            for(int j = i + 1; j < prices.length; j++) {
                if(prices[j] <= prices[i]) {
                    answer[i] -= prices[j];
                    break;
                }
            }
        }
        // return answer;

        // Stack Approach
        // Time Complexity: O(n)
        // Space Complexity: O(n)

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[prices.length];

        for(int i = 0; i < prices.length; i++) result[i] = prices[i];

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                result[index] = prices[index] - prices[i];
            }
            stack.push(i);
        }

        return result;
    }
}
