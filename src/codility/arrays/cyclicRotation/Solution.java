package codility.arrays.cyclicRotation;

public class Solution {

    public int[] solution(int[] arg, int moves) {
        if (arg.length == 0) {
            return arg;
        }

        int[] array = new int[arg.length];
        if (moves >= arg.length) {
            if (moves % arg.length == 0) {
                return arg;
            } else {
                moves = (moves % arg.length);
            }
        }

        for (int i = 0; i < arg.length; i++) {
            if (arg.length - moves + i >= arg.length) {
                array[i] = arg[i - moves];
            } else {
                array[i] = arg[arg.length - moves + i];
            }
        }
        return array;
    }
}
