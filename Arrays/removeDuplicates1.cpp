// LeetCode Problem: 26. Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// TC: O(n log n)
// SC: O(1)

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int removeDuplicates(vector<int> &nums)
{
    int size = nums.size();
    int k = 1, i = 1;

    sort(nums.begin(), nums.end());

    int lastduplicate = nums[0];
    while (i < size)
    {
        if (lastduplicate != nums[i])
        {
            nums[k++] = nums[i];
            lastduplicate = nums[i];
        }
        i++;
    }

    return k;
}