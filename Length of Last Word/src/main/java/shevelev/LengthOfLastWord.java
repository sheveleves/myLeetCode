package shevelev;

public class LengthOfLastWord
{
    public static int lengthOfLastWord(String s) {
        int lengthLastWord = 0;
        int length = s.length() - 1;
        while (length >= 0 && s.charAt(length) == ' ') {
            length--;
        }
        if (length == -1) {
            return 0;
        }

        while (length >= 0 && s.charAt(length) != ' ') {
            lengthLastWord++;
            length--;
        }
        return lengthLastWord;
    }
}
