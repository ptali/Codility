package codility.maximumSliceProblem.maxDoubleSliceSum;

public class Solution {

    public static int solution(int[] A) {
        int result = 0;
        int[] maxLeftSlice = new int[A.length];
        int[] maxRightSlice = new int[A.length];

        for (int i = 1; i < A.length - 1; i++) {
            maxLeftSlice[i] = Math.max(0, maxLeftSlice[i - 1] + A[i]);
        }

        for (int i = A.length - 2; i > 0; i--) {
            maxRightSlice[i] = Math.max(0, maxRightSlice[i + 1] + A[i]);
        }

        for (int i = 1; i < A.length - 1; i++) {
            result = Math.max(result, maxLeftSlice[i - 1] + maxRightSlice[i + 1]);
        }
        return result;
    }
}

