package codility.sorting.maxProductOfThree;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] A) {
        int result;
        int[] B = A;
        Arrays.sort(B);
        int x = B.length - 1;

        if (B[x] * B[x - 1] * B[x - 2] < B[0] * B[1] * B[x]) {
            result = B[0] * B[1] * B[x];
        } else {
            result = B[x] * B[x - 1] * B[x - 2];
        }
        return result;
    }
}
