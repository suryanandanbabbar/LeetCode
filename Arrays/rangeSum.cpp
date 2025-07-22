// LeetCode Problem: 1508. Range Sum of Sorted Subarray Sums
// Link: https://leetcode.com/problems/range-sum-of-sorted-subarray-sums

// TC: O(n^2 log n)
// SC: O(n^2)

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

const int MOD = 1e9 + 7;

int rangeSum(vector<int>& nums, int left, int right) {
    int n = nums.size();
    
    // Step 1: Compute all possible subarray sums
    vector<int> subarraySums;
    for (int start = 0; start < n; ++start) {
        int currentSum = 0;
        for (int end = start; end < n; ++end) {
            currentSum += nums[end];
            subarraySums.push_back(currentSum);
        }
    }
    
    // Step 2: Sort the subarray sums
    sort(subarraySums.begin(), subarraySums.end());
    
    // Step 3: Compute the sum from index left to right (1-based index)
    long long result = 0; // Use long long to handle large sums
    for (int i = left - 1; i < right; ++i) {
        result = (result + subarraySums[i]) % MOD;
    }
    
    return result;
}

int main() {
    vector<int> nums = {1, 2, 3, 4};
    int left = 1;
    int right = 5;
    
    cout << "Sum from index " << left << " to " << right << " is: " << rangeSum(nums, left, right) << endl;
    
    return 0;
}
