// LeetCode Problem: 1051. Height Checker
// Link: https://leetcode.com/problems/height-checker/

// TC: O(n log n)
// SC: O(n)

#include <iostream>
#include <algorithm>
using namespace std;

void heightChecker(int heights[])
{
    int size = sizeof(heights) / sizeof(heights[0]);
    int expected[size];

    for (int i = 0; i < size; i++)
    {
        expected[i] = heights[i];
    }

    for (int i = 0; i < size; i++)
    {
        cout << expected[i] << endl;
    }
}

int main()
{
    int heights[] = {1, 2, 3, 4, 5};
    int size = sizeof(heights) / sizeof(heights[0]);
    int expected[size];

    for (int i = 0; i < size; i++)
    {
        expected[i] = heights[i];
    }

    sort(expected, expected + size);
    for (int i = 0; i < size; i++)
    {
        cout << expected[i] << endl;
    }

    int count = 0;
    for (int i = 0, j = 0; i < size; i++, j++)
    {
        if (expected[i] != heights[i])
            count++;
    }

    cout << "Count: " << count << endl;
}