/* 
Question: You are given a 0-indexed string array words.

Let's define a boolean function isPrefixAndSuffix 
that takes two strings, str1 and str2:

isPrefixAndSuffix(str1, str2) returns true 
if str1 is both a prefix and a suffix of str2, 
and false otherwise.

For example, isPrefixAndSuffix("aba", "ababa") is true 
because "aba" is a prefix of "ababa" and also a suffix, 
but isPrefixAndSuffix("abc", "abcd") is false.

Return an integer denoting the number of index pairs (i, j)
such that i < j, 
and isPrefixAndSuffix(words[i], words[j]) is true.
 */

#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution {
public:
    bool isPrefixAndSuffix(const string& str1, const string& str2) {
        int len1 = str1.size();
        int len2 = str2.size();

        if(len1 > len2) 
            return false;

        // Prefix
        if(str2.substr(0, len1) != str1) 
            return false;

        // Suffix
        if(str2.substr(len2 - len1, len1) != str1) 
            return false;
        
        return true;
    }

    int countPrefixSuffixPairs(vector<string>& words) {
        int count = 0;

        for(int i = 0; i < words.size(); i++) {
            for(int j = i + 1; j < words.size(); j++) {
                if(isPrefixAndSuffix(words[i], words[j])) count++;
            }
        }
        return count;
    }
};