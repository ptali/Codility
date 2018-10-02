package codility.timeComplexity.frogJmp;

public class Solution {


    public int solution(int X, int Y, int D) {

        double distance = Y - X;
        double steps = Math.ceil(distance / D);

        return (int) steps;
    }
}
