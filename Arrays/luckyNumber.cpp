// LeetCode Problem: 1380. Lucky Number in a Matrix
// Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/

// TC: O(m * n)
// SC: O(m + n)

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int luckyNumber(int M[3][4])
{
    int m = 3;
    int n = 4;
    vector<int> rowMin(m, INT_MAX);
    vector<int> colMax(n, INT_MIN);

    for (int i = 0; i < m; ++i)
    {
        for (int j = 0; j < n; ++j)
        {
            if (M[i][j] < rowMin[i])
            {
                rowMin[i] = M[i][j];
            }
            if (M[i][j] > colMax[j])
            {
                colMax[j] = M[i][j];
            }
        }
    }

    for (int i = 0; i < m; ++i)
    {
        int minInRow = rowMin[i];
        int colIndex = -1;
        for (int j = 0; j < n; ++j)
        {
            if (M[i][j] == minInRow)
            {
                colIndex = j;
                break;
            }
        }
        // Check if this minInRow is the maximum in its column
        if (colIndex != -1 && minInRow == colMax[colIndex])
        {
            return minInRow;
            break;
        }
    }

    return -1;
}

int main()
{
    int M[3][4] = {
        {3, 7, 8},
        {9, 11, 13},
        {15, 16, 17}};

    cout << luckyNumber(M) << endl;
}