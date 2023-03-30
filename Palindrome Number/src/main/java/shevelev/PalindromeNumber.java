package shevelev;


import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
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

    public static void main(String[] args) {
        isPalindrome(8695);
    }
}
