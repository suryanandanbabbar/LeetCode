/*
Question: A phrase is a palindrome if,
after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters,
it reads the same forward and backward.

Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome,
or false otherwise.
*/

#include <iostream>
#include <string>
using namespace std;

bool isPalindrome(string s)
{
    int size = s.size();

    string corrected;
    for (char c: s) {
        if(isalnum(c)) {
            corrected += tolower(c);
        }
    }

    int left = 0;
    int right = s.size() - 1;

    while (left < right) {
        if (corrected[left] != corrected[right])    
            return false;
        left++;
        right--;
    }
    return true;
}

int main()
{
    string s = "A man, a plan, a canal: Panama";
    cout << isPalindrome(s) << endl;
}