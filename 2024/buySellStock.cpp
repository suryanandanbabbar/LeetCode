/*
Question: You are given an array prices
where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit
by choosing a single day to buy one stock and
choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

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