/*
Question: A distinct string is a string that is present only once in an array.
Given an array of strings arr, and an integer k, return the kth distinct string present in arr.
If there are fewer than k distinct strings, return an empty string "".
Note that the strings are considered in the order in which they appear in the array.

Example 1:

Input: arr = ["d","b","c","b","c","a"], k = 2
Output: "a"
Explanation:
The only distinct strings in arr are "d" and "a".
"d" appears 1st, so it is the 1st distinct string.
"a" appears 2nd, so it is the 2nd distinct string.
Since k == 2, "a" is returned.
*/

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