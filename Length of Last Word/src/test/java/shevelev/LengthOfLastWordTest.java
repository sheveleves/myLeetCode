package shevelev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.LengthOfLastWord.lengthOfLastWord;

class LengthOfLastWordTest {
    String s1 = "Hello World";
    String s2 = "   fly me   to   the moon  ";
    String s3 = "luffy is still joyboy";
    String s4 = "     ";
    String s5 = "a";

    @Test
    void lengthOfLastWordTest1() {
        assertThat(lengthOfLastWord(s1)).isEqualTo(5);
    }
    @Test
    void lengthOfLastWordTest2() {
        assertThat(lengthOfLastWord(s2)).isEqualTo(4);
    }
    @Test
    void lengthOfLastWordTest3() {
        assertThat(lengthOfLastWord(s3)).isEqualTo(6);
    }
    @Test
    void lengthOfLastWordTest4() {
        assertThat(lengthOfLastWord(s4)).isEqualTo(0);
    }
    @Test
    void lengthOfLastWordTest5() {
        assertThat(lengthOfLastWord(s5)).isEqualTo(1);
    }


}