/*
Question: A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

Example 1:
Input: s = "())"
Output: 1

Example 2:
Input: s = "((("
Output: 3
 */

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