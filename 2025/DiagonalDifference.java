import java.util.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
    */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int left = 0;
        int right = 0;
        
        for(int i = 0; i < arr.size(); i++) {
            left += arr.get(i).get(i);
            right += arr.get(i).get(arr.size() - i - 1);
        }
        return Math.abs(left - right);
    }

}
