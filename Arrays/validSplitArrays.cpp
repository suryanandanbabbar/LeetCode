/*
2270. Number of Ways to Split Array
(Medium)

You are given a 0-indexed integer array nums of length n.

'nums' contains a valid split at index 'i' if the following are true:

The sum of the first (i + 1) elements is greater than or equal to the sum of the last (n - i - 1) elements.
There is at least one element to the right of 'i'. That is, (0 <= i < n - 1).
Return the number of valid splits in nums.
 */

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