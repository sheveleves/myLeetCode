package shevelev;

public class Solution {
    public int minimizeXor(int num1, int num2) {
        int bitCount2 = Integer.bitCount(num2);
        int bitCount1 = Integer.bitCount(num1);

        if (bitCount2 == bitCount1) {
            return num1;
        }

        String binaryString1 = Integer.toBinaryString(num1);
        String[] splitNum1 = binaryString1.split("");

        StringBuilder result = new StringBuilder();
        int count = 0;


        for (int i = splitNum1.length - 1; i >= 0; i--) {
            if (bitCount2 < bitCount1) {
                if (splitNum1[i].equals("1") && count < bitCount1 - bitCount2) {
                    splitNum1[i] = "0";
                    count++;
                }
            } else {
                if (splitNum1.length < bitCount2) {
                    result.append("1".repeat(bitCount2));
                    String resultString = result.toString();
                    return Integer.parseInt(resultString, 2);
                } else {
                    if (splitNum1[i].equals("0") && count < bitCount2 - bitCount1) {
                        splitNum1[i] = "1";
                        count++;
                    }
                }
            }
        }

        String joinResult = String.join("", splitNum1);
        return Integer.parseInt(joinResult, 2);
    }
}
