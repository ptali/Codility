package codility.maximumSliceProblem.maxProfit;

public class Solution {


    public static int Solution(int[] A) {
        if (A.length < 2) {
            return 0;
        }
        int result = 0;
        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            result = Math.max(result, A[i] - min);
            min = Math.min(min, A[i]);
        }
        return result;
    }
}
