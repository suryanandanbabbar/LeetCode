// LeetCode Problem: 2053. Kth Distinct String in an Array
// Link: https://leetcode.com/problems/distinct-string/

// TC: O(n)
// SC: O(n)

#include <iostream>
#include <unordered_map>
#include <vector>
#include <string>
using namespace std;

string distinctString(string arr[], int k)
{
    int size = sizeof(arr) / sizeof(arr[0]);
    unordered_map<string, int> frequency;
    vector<string> distinctStrings;

    // Count the frequency of each string
    for (int i = 0; i < size; ++i)
    {
        frequency[arr[i]]++;
    }

    // Collect distinct strings
    for (int i = 0; i < size; ++i)
    {
        if (frequency[arr[i]] == 1)
        {
            // Add only if not already in distinctStrings
            if (find(distinctStrings.begin(), distinctStrings.end(), arr[i]) == distinctStrings.end())
            {
                distinctStrings.push_back(arr[i]);
            }
        }
    }

    // Return the k-th distinct string, or an empty string if k is out of range
    if (k > 0 && k <= distinctStrings.size())
    {
        return distinctStrings[k - 1];
    }
    else
    {
        return "";
    }
}