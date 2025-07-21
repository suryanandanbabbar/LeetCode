/*
Question: A school is trying to take an annual photo of all the students.
The students are asked to stand in a single file line in non-decreasing order by height.
Let this ordering be represented by the integer array expected
where expected[i] is the expected height of the ith student in line.

You are given an integer array heights
representing the current order that the students are standing in.
Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].
*/

#include <iostream>
#include <algorithm>
using namespace std;

void heightChecker(int heights[])
{
    int size = sizeof(heights) / sizeof(heights[0]);
    int expected[size];

    for (int i = 0; i < size; i++)
    {
        expected[i] = heights[i];
    }

    for (int i = 0; i < size; i++)
    {
        cout << expected[i] << endl;
    }
}

int main()
{
    int heights[] = {1, 2, 3, 4, 5};
    int size = sizeof(heights) / sizeof(heights[0]);
    int expected[size];

    for (int i = 0; i < size; i++)
    {
        expected[i] = heights[i];
    }

    sort(expected, expected + size);
    for (int i = 0; i < size; i++)
    {
        cout << expected[i] << endl;
    }

    int count = 0;
    for (int i = 0, j = 0; i < size; i++, j++)
    {
        if (expected[i] != heights[i])
            count++;
    }

    cout << "Count: " << count << endl;
}