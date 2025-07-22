// LeetCode Problem: 7. Reverse Integer
// Link: https://leetcode.com/problems/reverse-integer/

// TC: O(log n)
// SC: O(1)

#include <iostream>
#include <climits>
#include <limits>
using namespace std;

#define INT_MAX 2147483648
#define INT_MIN -2147483648

class Solution
{
public:
    int reverse(int x)
    {
        long long int reversed = 0;
        long long int temp = x;
        while (temp != 0)
        {
            int digit = temp % 10;

            if ((reversed > INT_MAX) || (reversed < INT_MIN))
            {
                return 0;
            }
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return reversed;
    }
};