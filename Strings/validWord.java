package Strings;
// LeetCode Problem: 3136. Valid Word
// Link: https://leetcode.com/problems/valid-word/

public class validWord {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        int countVowels = 0;
        int countConsonants = 0;
        
        for(char c: word.toCharArray()) {
            if(!Character.isLetterOrDigit(c)) 
                return false;
            else if("aeiouAEIOU".indexOf(c) >= 0) 
                countVowels++;
            else if(Character.isLetter(c))
                countConsonants++;
        }

        if(countVowels == 0) return false;
        if(countConsonants == 0) return false;

        return true;

    }
}

