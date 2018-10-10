package codility.arrays.oddOccurrencesInArray;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] A, int K) {

        if (A.length == 0) {
            return A;
        }

        int[] result = new int[A.length];
        int moves = (K % A.length);

        if (moves == 0) {
            return A;
        }

        for (int i = 0; i < A.length; i++) {
            if (A.length - moves + i >= A.length) {
                result[i] = A[i - moves];
            } else {
                result[i] = A[A.length - moves + i];
            }
        }
        return result;
    }
}
