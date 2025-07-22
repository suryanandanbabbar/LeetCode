// LeetCode Problem: 9. Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/

// TC: O(log n)
// SC: O(1)

#include <iostream>
using namespace std;

bool isPalindrome(int x)
{
    int reversedNum = 0;
    int originalNum = x;

    while (x != 0)
    {
        if (x > 0)
        {
            int digit = x % 10; // Last Digit
            reversedNum = reversedNum * 10 + digit;
            x /= 10; // Remove the last digit
        }
        else
        {
            int digit = abs(x) % 10; // Ignoring '-' sign
            reversedNum = reversedNum * 10 + digit;
            x /= 10;
        }
    }

    if (reversedNum == originalNum)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int x = 121;
    if (isPalindrome(x))
    {
        cout << "Palindrome." << endl;
    }
    else
    {
        cout << "Not a Palindrome." << endl;
    }
}
