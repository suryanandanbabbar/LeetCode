package Two_Pointers;
// LeetCode Problem: 128. Longest Consecutive Sequence
// Link: https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashSet;

public class longestConsecSeq {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums) {
            set.add(num);
        }

        int streak = 0;
        for(int num: nums) {
            if(!set.contains(num)) continue;
            set.remove(num);
            int currentNum = num;
            int currentStreak = 1;
            while(set.contains(currentNum + 1)) {
                currentNum++;
                set.remove(currentNum);
                currentStreak++;
            }
            while(set.contains(currentNum - 1)) {
                currentNum--;
                set.remove(currentNum);
                currentStreak++;
            }            streak = Math.max(streak, currentStreak);
        }
        return streak;

        
    }
}
