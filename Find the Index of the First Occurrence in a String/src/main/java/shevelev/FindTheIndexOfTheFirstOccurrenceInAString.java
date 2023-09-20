package shevelev;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int findTheIndexOfTheFirstOccurrenceInAString(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        String[] split = haystack.split(needle);
        return split.length == 0 ?  0 : split[0].length();
    }
}
