package codility.countingElements.maxCounters;

public class Solution {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxValue = 0;
        int maxCounter = 0;

        for (int i : A) {
            if (i == N + 1) {
                maxCounter = maxValue;
            } else if (i <= N) {
                if (counters[i - 1] < maxCounter) {
                    counters[i - 1] = maxCounter + 1;
                } else {
                    counters[i - 1]++;
                }
                if (counters[i - 1] > maxValue) {
                    maxValue = counters[i - 1];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (counters[i] < maxCounter) {
                counters[i] = maxCounter;
            }
        }
        return counters;
    }
}
