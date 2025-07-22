// LeetCode Problem: 921. Minimum Add to Make Parentheses Valid
// Link: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

// TC: O(n)
// SC: O(n)

#include <iostream>
#include <stack>
using namespace std;

class Solution
{
public:
    int minAddToMakeValid(string S)
    {
        stack<char> s;
        int count = 0;

        for (char i : S)
        {
            if (i == '(')
                s.push(i);
            else
            {
                if (s.empty())
                    count++;
                else
                    s.pop();
            }
        }
        return count + s.size();
    }
};