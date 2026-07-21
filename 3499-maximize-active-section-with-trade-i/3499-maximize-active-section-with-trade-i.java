class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int totalOnes = 0;
        int maxZeroMerge = 0;
        int currentZeros = 0;
        int previousZeros = 0;
        boolean hasSeenZeros = false;

        int n = s.length();
        int i = 0;

        while (i < n) {
            if (s.charAt(i) == '1') {
                totalOnes++;
                i++;
            } else {
                currentZeros = 0;
                while (i < n && s.charAt(i) == '0') {
                    currentZeros++;
                    i++;
                }
                
                if (hasSeenZeros) {
                    maxZeroMerge = Math.max(maxZeroMerge, previousZeros + currentZeros);
                }
                
                previousZeros = currentZeros;
                hasSeenZeros = true;
            }
        }

        return totalOnes + maxZeroMerge;
    }
}