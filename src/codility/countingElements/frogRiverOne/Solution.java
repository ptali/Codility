package codility.countingElements.frogRiverOne;

import java.util.Arrays;

public class Solution {

    public int solution(int X, int[] A) {
        int steps = 0;
        int[] moves = new int[X];
        Arrays.fill(moves, 1);

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X && moves[A[i] - 1] != 0) {
                moves[A[i] - 1]--;
                steps++;
                if (steps == X) {
                    return i;
                }
            }
        }
        return -1;
    }
}
