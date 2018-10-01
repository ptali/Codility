package codility.iterations.binaryGap;

public class Solution {

    private String removeZeros(int arg) {
        String binary = Integer.toBinaryString(arg);
        System.out.println(binary);
        while (true) {
            if (binary.charAt(0) == '0') {
                binary = binary.substring(1);
            }
            if (binary.charAt(binary.length() - 1) == '0') {
                binary = binary.substring(0, binary.length() - 1);
            } else return binary;
        }
    }

    public int solution(int arg) {
        String number = removeZeros(arg);
        String[] array = number.split("1");
        int result = 0;
        for (String string : array) {
            result = Math.max(result,string.length());
        }
        return result;
    }


}

