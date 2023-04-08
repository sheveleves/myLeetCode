package shevelev;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.LongestCommonPrefix.longestCommonPrefix;

class LongestCommonPrefixTest {
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_58 = 58;
    private static final int NUMBER_1994 = 1994;


    @Test
    void testlongestCommonPrefix1() {
        String[] strs = new String[] {"flower","flow","flight"};
        String expected = "fl";
        assertThat(longestCommonPrefix(strs)).isEqualTo(expected);
    }

    @Test
    void testlongestCommonPrefix2() {
        String[] strs = new String[] {"dog","racecar","car"};
        String expected = "";
        assertThat(longestCommonPrefix(strs)).isEqualTo(expected);
    }
    @Test
    void testlongestCommonPrefix3() {
        String[] strs = new String[] {"ab", "a"};
        String expected = "a";
        assertThat(longestCommonPrefix(strs)).isEqualTo(expected);
    }

    @Test
    void testlongestCommonPrefix4() {
        String[] strs = new String[] {"abab","aba",""};
        String expected = "";
        assertThat(longestCommonPrefix(strs)).isEqualTo(expected);
    }




}