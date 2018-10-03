package codility.prefixSums.minAvgTwoSlice;

public class Solution {

    public int solution(int[] A) {
        int result = 0;
        double current = (A[0] + A[1]) / 2;
        double twoSlice;
        double threeSlice;

        for (int i = 1; i < A.length; i++) {
            twoSlice = (A[i - 1] + A[i]) / 2.0;
            if (twoSlice < current) {
                current = twoSlice;
                result = i - 1;
            }
            if (i < A.length - 1) {
                threeSlice = (A[i - 1] + A[i] + A[i + 1]) / 3.0;
                if (threeSlice < current) {
                    current = threeSlice;
                    result = i - 1;
                }
            }
        }
        return result;
    }
}
