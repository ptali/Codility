package codility.sorting.triangle;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] A) {
        int result = 0;
        int[] B = A;
        Arrays.sort(B);
        if (B.length < 3) {
            return 0;
        }
        for (int i = 0; i < B.length - 2; i++) {
            if (B[i] >= 0 && (long) B[i] + (long) B[i + 1] > (long) B[i + 2]) {
                return 1;
            }
        }
        return result;
    }
}
