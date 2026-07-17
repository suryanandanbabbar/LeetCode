class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        long[] f = new long[max + 1];
        for (int x : nums) f[x]++;

        long[] div = new long[max + 1];
        for (int g = 1; g <= max; g++) {
            for (int x = g; x <= max; x += g) {
                div[g] += f[x];
            }
        }

        long[] exact = new long[max + 1];
        for (int g = max; g >= 1; g--) {
            exact[g] = div[g] * (div[g] - 1) / 2;

            for (int m = 2 * g; m <= max; m += g) {
                exact[g] -= exact[m];
            }
        }

        long[] prefix = new long[max + 1];
        for (int g = 1; g <= max; g++) {
            prefix[g] = prefix[g - 1] + exact[g];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long target = queries[i] + 1;

            int left = 1, right = max;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (prefix[mid] >= target)
                    right = mid;
                else
                    left = mid + 1;
            }

            ans[i] = left;
        }

        return ans;
    }
}