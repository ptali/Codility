package codility.leader.EquiLeader;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] A) {

        if (A.length == 1) {
            return 0;
        }
        int leader = 0;
        boolean isLeader = false;
        Map<Integer, Integer> map = new HashMap<>();

        for (int value : A) {
            if (map.containsKey(value)) {
                if (map.get(value) >= A.length / 2) {
                    leader = value;
                    map.put(value, map.get(value) + 1);
                    isLeader = true;
                } else {
                    map.put(value, map.get(value) + 1);
                }
            } else {
                map.put(value, 1);
            }
        }

        if (!isLeader) {
            return 0;
        }

        int leaderCount = map.get(leader);
        int left = 0;
        int result = 0;
        int right;
        int rightLength;
        int leftLength;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                left++;
            }
            right = leaderCount - left;
            leftLength = i + 1;
            rightLength = A.length - leftLength;
            if (left > leftLength / 2 && right > rightLength / 2) {
                result++;
            }
        }
        return result;
    }
}
