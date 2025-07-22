// LeetCode Problem: 189. Rotate Array
// Link: https://leetcode.com/problems/rotate-array/

// TC: O(n)
// SC: O(1)

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void rightShiftRotate(vector<int>& nums, int k) {
    int size = nums.size();
    
    if (size == 0) {
        return; // No rotation needed for empty array
    }

    k = k % size; // Normalize k

    if (k == 0) {
        return; // No rotation needed if k is 0
    }

    // Reverse the whole array
    reverse(nums.begin(), nums.end());
    
    // Reverse the first k elements
    reverse(nums.begin(), nums.begin() + k);
    
    // Reverse the remaining elements
    reverse(nums.begin() + k, nums.end());
}

int main() {
    vector<int> nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;

    rightShiftRotate(nums, k);

    for (int num : nums) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
