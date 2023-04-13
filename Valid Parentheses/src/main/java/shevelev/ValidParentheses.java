package shevelev;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Set<Character> open = Set.of('(', '{', '[');
        Set<Character> close = Set.of(')', '}', ']');

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (open.contains(s.charAt(i))) {
                list.add(s.charAt(i));
            }
            if (close.contains(s.charAt(i))) {
                if (list.isEmpty()) {
                    return false;
                }
                char con = 0;
                switch (s.charAt(i)) {
                    case ')' -> con = '(';
                    case '}' -> con = '{';
                    case ']' -> con = '[';

                }
                if (list.get(list.size() - 1) != con) {
                    return false;
                } else {
                    list.remove(list.size() - 1);
                }
            }
        }
        return list.isEmpty();
    }
}
