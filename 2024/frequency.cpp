#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int nums[] = {1, 2, 2, 3, 1, 4};

    int n = sizeof(nums) / sizeof(nums[0]);
    sort(nums, nums + n);

    int i = 0, count = 0;

    while (i < n)
    {
        int j = i;
        while (j < n && nums[j] == nums[i])
            j++;

        count += j - i;

        i = j;
    }
    cout << count << endl;
}