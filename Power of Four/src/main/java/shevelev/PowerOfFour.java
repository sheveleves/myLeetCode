package shevelev;


public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        String binaryString = Integer.toBinaryString(n);
        String substring = binaryString.substring(1);
        if (n == 0 || substring.contains("1") || (substring.length() % 2) != 0) {
            return false;
        }
        return true;
    }
}
