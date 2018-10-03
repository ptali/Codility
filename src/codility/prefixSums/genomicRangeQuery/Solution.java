package codility.prefixSums.genomicRangeQuery;

public class Solution {

    public int[] solution(String S, int[] P, int[] Q) {
        int[][] prefixSums = new int[3][S.length() + 1];
        int a = 0;
        int c = 0;
        int g = 0;
        int[] minImpactFactors = new int[P.length];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A') {
                a += 1;
            } else if (S.charAt(i) == 'C') {
                prefixSums[1][i + 1]++;
                c += 1;
            } else if (S.charAt(i) == 'G') {
                prefixSums[2][i + 1]++;
                g += 1;
            }
            prefixSums[0][i + 1] = a;
            prefixSums[1][i + 1] = c;
            prefixSums[2][i + 1] = g;
        }

        for (int i = 0; i < P.length; i++) {
            if (prefixSums[0][Q[i] + 1] - prefixSums[0][P[i]] > 0) {
                minImpactFactors[i] = 1;
            } else if (prefixSums[1][Q[i] + 1] - prefixSums[1][P[i]] > 0) {
                minImpactFactors[i] = 2;
            } else if (prefixSums[2][Q[i] + 1] - prefixSums[2][P[i]] > 0) {
                minImpactFactors[i] = 3;
            } else {
                minImpactFactors[i] = 4;
            }
        }
        return minImpactFactors;
    }
}
