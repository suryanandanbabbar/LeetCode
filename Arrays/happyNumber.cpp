#include <iostream>
using namespace std;

int getSumOfSquares(int num)
{
    int sum = 0;
    while (num > 0)
    {
        int digit = num % 10;
        sum += digit * digit;
        num /= 10;
    }
    return sum;
}

bool isHappy(int n)
{
    int slow = n;
    int fast = getSumOfSquares(n);

    // Using Floyd's cycle-finding algorithm (tortoise and hare)
    while (fast != 1 && slow != fast)
    {
        slow = getSumOfSquares(slow);
        fast = getSumOfSquares(getSumOfSquares(fast));
    }

    return fast == 1;
}

int main()
{
    int number;
    cout << "Enter a number: ";
    cin >> number;

    if (isHappy(number))
    {
        cout << number << " is a happy number." << endl;
    }
    else
    {
        cout << number << " is not a happy number." << endl;
    }

    return 0;
}
