package codility.arrays.oddOccurrencesInArray;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {

        int result = A[0];
        Arrays.sort(A);

        int duplicate = 1;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                duplicate++;
            } else if (duplicate % 2 == 0) {
                duplicate = 1;
                if (i == A.length - 2)
                    return A[A.length - 1];
            } else {
                return A[i];
            }
        }
        return result;
    }
}
