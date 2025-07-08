/*
 Count the number of words in a camel case string.
 */

class camelCaseSolution {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
        int count = 1;
        for(int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) count++;
        }
        return count;
    }

}