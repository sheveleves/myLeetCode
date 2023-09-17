package shevelev;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.FindTheIndexOfTheFirstOccurrenceInAString.findTheIndexOfTheFirstOccurrenceInAString;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    private static final String needle = "leed";

    private static final String haystack = "leedcodeString";
    private static final String haystack1 = "stringleedcodeString";
    private static final String haystack2 = "string";



    @Test
    void testFindTheIndexOfTheFirstOccurrenceInAString() {
        assertThat(findTheIndexOfTheFirstOccurrenceInAString(haystack, needle)).isEqualTo(0);
        assertThat(findTheIndexOfTheFirstOccurrenceInAString(haystack1, needle)).isEqualTo(6);
        assertThat(findTheIndexOfTheFirstOccurrenceInAString(haystack2, needle)).isEqualTo(-1);
    }
}