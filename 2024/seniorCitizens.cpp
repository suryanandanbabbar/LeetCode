#include <iostream>
#include <string>
using namespace std;

void countSeniors(string s)
{
    // Extract age from string
    string ageStr = s.substr(11, 2);

    // Convert to integer
    int age = stoi(ageStr);

    if (age > 60)
        cout << "Senior Citizen" << endl;
    else
        cout << "Not a senior citizen" << endl;
}

int main()
{
    string S = "7868190130M7522";
    countSeniors(S);
}