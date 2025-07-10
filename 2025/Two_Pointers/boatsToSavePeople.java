package Two_Pointers;
// LeetCode Problem: 881. Boats to Save People
// Link: https://leetcode.com/problems/boats-to-save-people/

// TC: O(n log n)
// SC: O(1)

import java.util.Arrays;

public class boatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int result = 0;
        
        int i = 0, j = people.length - 1;
        while(i <= j) {
            if(people[i] + people[j] <= limit) {
                i++; 
                j--;
            }
            else j--;
            result++;
        }

        return result;
    }
}

