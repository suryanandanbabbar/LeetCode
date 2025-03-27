/*
Question: Given an array arr of integers,
check if there exist two indices i and j such that :

1. i != j
2. 0 <= i, j < arr.length
3. arr[i] == 2 * arr[j]


Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 */

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