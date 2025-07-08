/*
 * Problem: Strong Password
It satisfies the following criteria:
Its length is at least 6.
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+

Louise typed a random string of length  in the password field but wasn't sure if it was strong. 
Given the string she typed, can you find the minimum number of characters she must add to make her password strong?
 */

class StrongPassword {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (numbers.indexOf(c) >= 0) hasDigit = true;
            else if (lower_case.indexOf(c) >= 0) hasLower = true;
            else if (upper_case.indexOf(c) >= 0) hasUpper = true;
            else if (special_characters.indexOf(c) >= 0) hasSpecial = true;
        }

        int missingTypes = 0;
        if (!hasDigit) missingTypes++;
        if (!hasLower) missingTypes++;
        if (!hasUpper) missingTypes++;
        if (!hasSpecial) missingTypes++;

        return Math.max(missingTypes, 6 - n);
    }

}

