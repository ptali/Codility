package codility.sorting.distinct;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] A) {
        int[] B = A;
        Arrays.sort(B);

        if (B.length == 0) {
            return 0;
        }
        int result = 1;
        for (int i = 1; i < B.length; i++) {
            if (B[i] != B[i - 1]) {
                result++;
            }
        }
        return result;
    }
}
