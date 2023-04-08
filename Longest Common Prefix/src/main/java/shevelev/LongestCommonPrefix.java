package shevelev;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int ichar = 0;

        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            ichar = 0;
            if (strs[i].equals("")) {
                return "";
            }

            while (ichar < (Math.min(strs[i].length(), result.length()))) {
                if (result.length() > strs[i].length()) {
                    result = result.substring(0, strs[i].length());

                }
                if (result.charAt(ichar) != strs[i].charAt(ichar)) {
                    result = result.substring(0, ichar);
                    if (result.length() == 0) {
                        return "";
                    }
                }
//                if (ichar == strs[i].length() - 1) {
//                    result = result.substring(0, ichar);
//                }
                ichar++;
            }
        }
        return  result;
    }
}
