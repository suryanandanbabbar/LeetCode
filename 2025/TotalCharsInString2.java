/*
3337: Total Characters in a String After Transformations 2

You are given a string s consisting of lowercase English letters, an integer t representing the number of transformations to perform, and an array nums of size 26. In one transformation, every character in s is replaced according to the following rules:

Replace s[i] with the next nums[s[i] - 'a'] consecutive characters in the alphabet. For example, if s[i] = 'a' and nums[0] = 3, the character 'a' transforms into the next 3 consecutive characters ahead of it, which results in "bcd".
The transformation wraps around the alphabet if it exceeds 'z'. For example, if s[i] = 'y' and nums[24] = 3, the character 'y' transforms into the next 3 consecutive characters ahead of it, which results in "zab".
Return the length of the resulting string after exactly t transformations.

Since the answer may be very large, return it modulo 109 + 7.
 */


import java.util.List;

class Solution {
    private static final int mod = 1000000007;

    private long[][] multiplyMatrices(long[][] A, long[][] B) {
        int rowsA = A.length, colsA = A[0].length, colsB = B[0].length;
        long[][] result = new long[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                long sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum = (sum + (A[i][k] * B[k][j]) % mod) % mod;
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    private long[][] powerMatrix(long[][] matrix, long exponent) {
        int n = matrix.length;
        long[][] result = new long[n][n];
        for (int i = 0; i < n; i++) result[i][i] = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) result = multiplyMatrices(result, matrix);
            matrix = multiplyMatrices(matrix, matrix);
            exponent >>= 1;
        }
        return result;
    }

    public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
        long[][] transform = new long[26][26];
        for (int i = 0; i < 26; i++) {
            for (int shift = 0; shift < nums.get(i); shift++) {
                transform[i][(i + 1 + shift) % 26]++;
            }
        }
        transform = powerMatrix(transform, t);
        long[][] freq = new long[1][26];
        for (char ch : s.toCharArray()) {
            freq[0][ch - 'a']++;
        }
        freq = multiplyMatrices(freq, transform);
        long total = 0;
        for (long cnt : freq[0]) {
            total = (total + cnt) % mod;
        }
        return (int)total;
    }
}