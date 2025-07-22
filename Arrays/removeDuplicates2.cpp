// LeetCode Problem: 80. Remove Duplicates from Sorted Array II
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

// TC: O(n)
// SC: O(1)

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int removeDuplicates(vector<int> &nums)
{
    int size = nums.size();
    int k = 1, i = 1;
    int count = 1;

    while (i < size)
    {
        if (nums[i] == nums[i - 1])
            count++;
        else
            // Reset count for a new element
            count = 1;

        if (count <= 2)
            nums[k++] = nums[i];

        i++;
    }

    return k;
}