package codility.timeComplexity.tapeEquilibrium;

public class Solution {

    public int solution(int[] A) {
        int resultA = 0;
        int resultB = 0;
        int[] result = new int[A.length - 1];
        int[] a = new int[A.length - 1];
        int[] b = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++) {
            resultA += A[i];
            resultB += A[A.length - 1 - i];
            a[i] = resultA;
            b[i] = resultB;
        }

        int res = Math.abs(a[0] - b[b.length - 1]);
        for (int i = 1; i < A.length - 1; i++) {
            result[i] = Math.abs(a[i] - b[b.length - 1 - i]);
            if (result[i] < res) {
                res = result[i];
            }
        }
        return res;
    }
}
