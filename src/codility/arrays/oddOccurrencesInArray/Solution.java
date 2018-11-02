package codility.arrays.oddOccurrencesInArray;

import java.util.*;

public class Solution {

    public int solution(int[] A) {

        int result = A[0];
        Set<Integer> set = new HashSet<>();

        for (int i : A) {
            if (set.contains(i)) {
                set.remove(i);
                continue;
            }
            set.add(i);
        }

        //there's only one value in the set
        for (int value : set) {
            result = value;
        }
        return result;
    }
}
