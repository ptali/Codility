package codility.prefixSums.passingCars;

public class Solution {

    public int solution(int[] A) {
        int result = 0;
        int zero = 0;

        for (int i : A) {
            if (i == 0) {
                zero++;
            }
            if (i == 1) {
                result += zero;
            }
            if (result > 1000000000) {
                return -1;
            }
        }
        return result;
    }

}
