// LeetCode Problem: 2270. Valid Split of an Array
// Link: https://leetcode.com/problems/number-of-ways-to-split-array/

// TC: O(n)
// SC: O(1)

#include <iostream>
#include <vector>
using namespace std;

int waysToSplitArray(vector<int> &nums)
{
    long long int sumFirst = 0, sumLast = 0, totalSum = 0;
    int validSplits = 0;
    int n = nums.size();

    for (int i : nums)
    {
        totalSum += i;
    }
    for (int i = 0; i < nums.size() - 1; i++)
    {
        sumFirst += nums[i];
        sumLast = totalSum - sumFirst;
        if ((sumFirst >= sumLast))
        {
            validSplits++;
        }
    }
    return validSplits;
}

int main()
{
    vector<int> nums = {10, 4, -8, 7};

    cout << waysToSplitArray(nums) << endl;
}