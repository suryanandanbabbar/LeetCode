#include <iostream>
#include <algorithm>
using namespace std;

int canBeEqual(int arr2[], int arr1[], int size1, int size2)
{

    sort(arr1, arr1 + size1);
    sort(arr2, arr2 + size2);

    int i;
    for (i = 0; i < size1; i++)
    {
        if (arr2[i] != arr1[i])
        {
            return false;
        }
    }
    return true;
}

int main()
{
    int arr1[] = {2, 4, 1, 3};
    int arr2[] = {1, 2, 3, 4};

    int size1 = sizeof(arr1) / sizeof(arr1[0]);
    int size2 = sizeof(arr2) / sizeof(arr2[0]);

    cout << canBeEqual(arr1, arr2, size1, size2) << endl;
}