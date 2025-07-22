// LeetCode Problem: 27. Remove Element
// Link: https://leetcode.com/problems/remove-element/

// TC: O(n)
// SC: O(1)

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int removeElement(vector<int> &nums, int val)
{
    int size = nums.size();
    int k = 0;

    sort(nums.begin(), nums.end());

    for (int i = 0; i < size; i++)
    {
        if (nums[i] != val)
        {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
}
