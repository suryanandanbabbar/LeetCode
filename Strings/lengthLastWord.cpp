#include <iostream>
#include <string>
#include <cstring>
#include <sstream>
using namespace std;

int main()
{
    string s = "Hello World";

    string word;
    stringstream ss(s);
    int wordCount = 0;
    
    while(ss >> word) {  
    
        wordCount++;
    }

    cout << wordCount << endl;
}