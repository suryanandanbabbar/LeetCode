/*
Question: Convert a non-negative integer num
to its English words representation.
*/

#include <iostream>
#include <vector>
#include <string>

using namespace std;

const vector<string> below_20{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                              "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                              "Eighteen", "Nineteen"};

const vector<string> tens{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

const vector<string> thousands{"", "Thousand", "Million", "Billion"};

string one(int num) {
    return below_20[num];
}

string two(int num) {
    if (num < 20) return one(num);
    else {
        int ten = num / 10;
        int rest = num - ten * 10;
        return tens[ten] + (rest ? " " + one(rest) : "");
    }
}

string three(int num) {
    int hundred = num / 100;
    int rest = num - hundred * 100;
    return (hundred ? one(hundred) + " Hundred" + (rest ? " " + two(rest) : "") : two(rest));
}

string numberToWords(int num) {
    if (num == 0) return "Zero";
    
    string words;
    int i = 0;
    
    while (num) {
        if (num % 1000 != 0) {
            words = three(num % 1000) + " " + thousands[i] + (words.empty() ? "" : " ") + words;
        }
        num /= 1000;
        i++;
    }
    
    return words;
}

int main() {
    int num;
    cout << "Enter a non-negative integer: ";
    cin >> num;
    
    if (num < 0) {
        cout << "Number should be non-negative!" << endl;
        return 1;
    }
    
    cout << "The number in words is: " << numberToWords(num) << endl;
    return 0;
}
