package shevelev;


import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static boolean isPalindromeOld(int x) {
        if (x < 0) {
            return false;
        }

        var sd = String.valueOf(x).split("");
        var i = 0;
        var j = sd.length - 1;

        while (i < j) {
            if (!sd[i++].equals(sd[j--])) {
                return false;
            }

        }
        return true;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        List<Integer> number = new ArrayList<>();
        while (x > 0) {
            number.add(x % 10);
            x = (int) Math.floor(x / 10);
        }
        int i = 0;
        int size = number.size() - 1;
        while (i < size) {
            if (number.get(i++) != number.get(size--)) {
                return false;
            }
        }
        return true;
    }
}
