package codility.countingElements.permCheck;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        int result = 0;
        int perm = 1;
        int[] B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);

        for (int i : B) {
            if (i == perm) {
                perm++;
                result = 1;
            } else {
                result = 0;
                break;
            }
        }
        return result;
    }
}
