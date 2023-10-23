package shevelev;


public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        int i1 = 0, i2 = 0;
        int i = 0;
        int maxLength = Math.max(s.length(), t.length());
        String s1 = "", t1 = "";
        while (i < maxLength) {
            if (i < s.length()) {
                if (s.charAt(i) != '#') {
                    i1++;
                    s1 = s1.concat(Character.toString(s.charAt(i)));
                } else if (i1 == 1) {
                    s1 = "";
                    i1--;
                } else if (i1 != 0) {
                    s1 = s1.substring(0, s1.length() - 1);
                    i1--;
                }
            }
            if (i < t.length()) {
                if (t.charAt(i) != '#') {
                    i2++;
                    t1 = t1.concat(Character.toString(t.charAt(i)));
                } else if (i2 == 1) {
                    t1 = "";
                    i2--;
                } else if (i2 != 0) {
                    t1 = t1.substring(0, t1.length() - 1);
                    i2--;
                }
            }
            i++;
        }
        return s1.equals(t1);
    }
}
