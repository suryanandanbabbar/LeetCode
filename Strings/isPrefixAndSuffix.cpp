// LeetCode Problem: 3042. Is Prefix and Suffix
// Link: https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/

// TC: O(n)
// SC: O(1)

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