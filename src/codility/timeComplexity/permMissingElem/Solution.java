package codility.timeComplexity.permMissingElem;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        int[] B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);
        for (int i = 0; i < B.length; i++) {
            if (B[i] != (i + 1)) {
                return i + 1;
            } else if (i == B.length - 1) {
                return B.length + 1;
            }
        }
        return 1;
    }
}
