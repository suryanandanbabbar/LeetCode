package Two_Pointers;
// LeetCode Problem: 948. Bag of Tokens
// Link: https://leetcode.com/problems/bag-of-tokens/

// TC: O(n log n)
// SC: O(1)


import java.util.Arrays;

public class bagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0, maxScore = 0;
        int i = 0, j = tokens.length - 1;

        while (i <= j) {
            if (tokens[i] <= power) {
                power -= tokens[i++];
                score++;
                maxScore = Math.max(maxScore, score);
            } else if (score >= 1) {
                power += tokens[j--];
                score--;
            } else {
                break;
            }
        }

        return maxScore;
    }
}

