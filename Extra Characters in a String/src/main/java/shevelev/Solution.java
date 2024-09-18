package shevelev;


import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    static HashSet<String> dic;
    static String str;
    static Integer[] arr;

    public static int minExtraChar(String s, String[] dictionary) {
        dic = new HashSet<>(Arrays.asList(dictionary));
        str = s;
        arr = new Integer[s.length()];
        return bs(0);
    }

    public static int bs(int end) {
        if (arr[end] != null) {
            return arr[end];
        }

        if (end == 0) {
            String sub = str.substring(0, 1);
            if (dic.contains(sub)) {
                arr[0] = 0;
            } else {
                arr[0] = 1;
            }
        } else {
            int start = 0;

            int extra = bs(end - 1) + 1;
            while (start <= end) {

                String sub = str.substring(start, end + 1);
                if (dic.contains(sub)) {
                    if (start == 0) {
                        extra = 0;
                        break;
                    }
                    extra = Math.min(arr[start - 1], extra);
                }
                start++;
            }
            arr[end] = extra;
        }
        if ((end + 1) != str.length()) {
            arr[end + 1] = bs(end + 1);
        }
        return arr[str.length() - 1];
    }
}
