/*
Question:
You are given a string word containing lowercase English letters.

Telephone keypads have keys mapped with distinct collections of lowercase English letters,
which can be used to form words by pushing them.
For example, the key 2 is mapped with ["a","b","c"],
we need to push the key one time to type "a",
two times to type "b", and three times to type "c" .

It is allowed to remap the keys numbered 2 to 9
to distinct collections of letters.
The keys can be remapped to any amount of letters,
but each letter must be mapped to exactly one key.
You need to find the minimum number of times the keys will be pushed to type the string word.

Return the minimum number of pushes needed to type word after remapping the keys.

Note that 1, *, #, and 0 do not map to any letters.
*/

#include <iostream>
#include <string>
using namespace std;

int minPushes(string word)
{
    int count = 0;
    for (int i = 0; word[i] != '\0'; i++)
    {
        switch (word[i])
        {
        case 'a':
            count += 1;
            break;
        case 'b':
            count += 1;
            break;
        case 'c':
            count += 1;
            break;
        case 'd':
            count += 1;
            break;
        case 'e':
            count += 1;
            break;
        case 'p':
            count += 1;
            break;
        case 't':
            count += 1;
            break;
        case 'w':
            count += 1;
            break;
        case 'f':
            count += 2;
            break;
        case 'h':
            count += 2;
            break;
        case 'j':
            count += 2;
            break;
        case 'l':
            count += 2;
            break;
        case 'n':
            count += 2;
            break;
        case 'q':
            count += 2;
            break;
        case 'u':
            count += 2;
            break;
        case 'x':
            count += 2;
            break;
        case 'g':
            count += 3;
            break;
        case 'i':
            count += 3;
            break;
        case 'k':
            count += 3;
            break;
        case 'm':
            count += 3;
            break;
        case 'o':
            count += 3;
            break;
        case 'r':
            count += 3;
            break;
        case 'v':
            count += 3;
            break;
        case 'y':
            count += 3;
            break;
        case 's':
            count += 4;
            break;
        case 'z':
            count += 4;
            break;
        }
    }
    return count;
}

int main()
{
    string word = "xyzxyzxyzxyz";

    cout << "Min Pushes: " << minPushes(word) << endl;
}