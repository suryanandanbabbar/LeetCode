// LeetCode Problem: 1346. Check If N and Its Double Exist
// Link: https://leetcode.com/problems/check-if-n-and-its-double-exist/

// TC: O(n^2)
// SC: O(1)

#include <iostream>
#include <vector>
using namespace std;

bool checkIfExist(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (arr[i] == 2 * arr[j] && i != j)
                return true;
        }
    }
    return false;
}

int main()
{
    int n = 7;
    int arr[7] = {-2, 0, 10, -19, 4, 6, -8};

    if (checkIfExist(arr, n))
        cout << "YES" << endl;
    else
        cout << "NO" << endl;
}