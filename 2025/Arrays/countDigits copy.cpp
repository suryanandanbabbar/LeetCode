#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;

int countDigits(int n)
{
    int count = (int)(log10(n) + 1);
    return count;
}

int main()
{
    int N = 329823;
    cout << countDigits(N) << endl;
    return 0;
}
