// LeetCode Problem: Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// TC: O(n)
// SC: O(1)

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int maxProfit(int prices[], int size)
{
    int min = INT_MAX, max = 0;

    for (int i = 0; i < size; i++)
    {
        if (prices[i] < min)
            min = prices[i];
        else if (prices[i] - min > max)
            max = prices[i] - min;
    }
    return max;
}

int main()
{
    int prices[6] = {7, 1, 3, 4, 6, 5};

    cout << "Max Profit: " << maxProfit(prices, 6) << endl;
}