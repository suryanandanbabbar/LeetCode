class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> a = new HashSet<>();
        HashSet<Character> b = new HashSet<>();
        
        int count = 0;
        for(char c: word.toCharArray()) {
            if(Character.isLowerCase(c)) a.add(c);
            else b.add(Character.toLowerCase(c));
        }

        for(char c: a) if(b.contains(c)) count++;
        
        return count;    
    }
}