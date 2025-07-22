// LeetCode Problem: 88. Merge Sorted Array
// Link: https://leetcode.com/problems/merge-sorted-array/

// TC: O((m + n) log(m + n))
// SC: O(1)

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for (int j = 0, i = m; j<n; j++){
            nums1[i] = nums2[j];
            i++;
        }
        sort(nums1.begin(),nums1.end());
    }
