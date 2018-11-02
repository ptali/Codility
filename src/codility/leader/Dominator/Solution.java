package codility.leader.Dominator;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] A) {
        if (A.length == 1) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                if (map.get(A[i]) >= A.length / 2) {
                    return i;
                } else {
                    map.put(A[i], map.get(A[i]) + 1);
                }
            } else {
                map.put(A[i], 1);
            }
        }
        return -1;
    }
}
