package shevelev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.ValidParentheses.isValid;

class ValidParenthesesTest {
    @Test
    void testisValid1() {
        String s = "()";
        assertThat(isValid(s)).isTrue();
    }

    @Test
    void testisValid2() {
        String s = "()[]{}";
        assertThat(isValid(s)).isTrue();
    }

    @Test
    void testisValid3() {
        String s = "(]";
        assertThat(isValid(s)).isFalse();
    }

    @Test
    void testisValid4() {
        String s = "]";
        assertThat(isValid(s)).isFalse();
    }

    @Test
    void testisValid5() {
        String s = "{";
        assertThat(isValid(s)).isFalse();
    }


}