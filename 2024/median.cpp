#include <iostream>
using namespace std;

struct Array
{
    int A[20];
    int size;
    int length;
};

struct Array *median(struct Array *arr1, struct Array *arr2)
{
    int i = 0, j = 0, k = 0;
    struct Array *arr3 = new struct Array;

    while (i < arr1->length && j < arr2->length)
    {
        if (arr1->A[i] < arr2->A[j])
        {
            arr3->A[k++] = arr1->A[i++];
        }
        else
        {
            arr3->A[k++] = arr2->A[j++];
        }
    }
    // Copying remaning elements from arr1
    for (; i < arr1->length; i++)
    {
        arr3->A[k++] = arr1->A[i];
    }
    // Copying remaning elements from arr2
    for (; j < arr2->length; j++)
    {
        arr3->A[k++] = arr2->A[j];
    }
    arr3->length = k;
    arr3->size = 20;

    float median;
    if (arr3->length % 2 == 0)
    {
        // Even number of elements
        median = (arr3->A[arr3->length / 2 - 1] + arr3->A[arr3->length / 2]) / 2.0;
    }
    else
    {
        // Odd number of elements
        median = arr3->A[arr3->length / 2];
    }

    cout << "Median: " << median << endl;

    return arr3;
}



int main()
{
    struct Array arr1 = {{1, 2}, 20, 2};
    struct Array arr2 = {{3, 4}, 20, 2};
    struct Array *arr3;

    arr3 = median(&arr1, &arr2);

    delete arr3;
}