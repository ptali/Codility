package codility.countingElements.missingInteger;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        int result = 1;
        int [] B=Arrays.copyOf(A,A.length);
        Arrays.sort(B);
        if (B[B.length - 1] <= 0) {
            return result;
        }
        for (int i : B) {
            if (i == result) {
                result++;
            }
        }
        return result;
    }
}
