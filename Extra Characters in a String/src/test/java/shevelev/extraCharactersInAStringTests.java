package shevelev;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class extraCharactersInAStringTests {

    @Test
    void extraCharactersInAStringTest1() {
        String s = "leetscode";
        String[] dictionary = {"leet", "code", "leetcode"};
        assertThat(Solution.minExtraChar(s, dictionary)).isEqualTo(1);
    }

    @Test
    void extraCharactersInAStringTest2() {
        String s = "l";
        String[] dictionary = {"leet", "code", "leetcode"};
        assertThat(Solution.minExtraChar(s, dictionary)).isEqualTo(1);
    }

    @Test
    void extraCharactersInAStringTest3() {
        String s = "l";
        String[] dictionary = {"leet", "code", "leetcode", "l"};
        assertThat(Solution.minExtraChar(s, dictionary)).isEqualTo(0);
    }

    @Test
    void extraCharactersInAStringTest4() {
        String s = "sayhelloworld";
        String[] dictionary = {"hello","world"};
        assertThat(Solution.minExtraChar(s, dictionary)).isEqualTo(3);
    }
}
