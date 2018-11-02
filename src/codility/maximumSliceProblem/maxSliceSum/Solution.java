package codility.maximumSliceProblem.maxSliceSum;

public class Solution {

    public static int Solution(int[] A) {
        int maxSlice = A[0];
        int maxSum = maxSlice;

        for (int i = 1; i < A.length; i++) {
            maxSum = Math.max(maxSum + A[i], A[i]);
            maxSlice = Math.max(maxSum, maxSlice);
        }
        return maxSlice;
    }
}
