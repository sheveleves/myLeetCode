package shevelev;

import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<String, Integer> map = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000);

        String[] strings = s.split("");

        int result = 0;
        int length = strings.length;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < length; i++) {
            num1 = map.get(strings[i]);
            if (i == length - 1) {
                return result +=num1;
            }
            num2 = map.get(strings[i + 1]);
            if (num2 <= num1) {
                result += num1;
            } else {
                result += num2 - num1;
                i++;
            }
        }
        return result;
    }
}
