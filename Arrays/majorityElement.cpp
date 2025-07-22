// LeetCode Problem: 169. Majority Element
// Link: https://leetcode.com/problems/majority-element/

// TC: O(n)
// SC: O(1)

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
    int num[] = {3, 2, 3, 2, 2};
    int size = sizeof(num) / sizeof(num[0]);
    int count = 1;
    int majElement = 0;

    sort(num, num + size);

    for(int i = 0; i < size; i++)
    {
        if (num[i] == num[i - 1])
            count++;
        else
            // Reset count for a new element
            count = 1;

        if (count > size / 2) {
            majElement = num[i];
            break;
        }
    }

    cout << majElement << endl;
}