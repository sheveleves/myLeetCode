package shevelev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.RomanToInteger.romanToInt;

class RomanToIntegerTest {
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_58 = 58;
    private static final int NUMBER_1994 = 1994;


    @Test
    void testRomanToInt1() {
        assertThat(romanToInt("III")).isEqualTo(NUMBER_3);
    }

    @Test
    void testRomanToInt2() {
        assertThat(romanToInt("LVIII")).isEqualTo(NUMBER_58);
    }

    @Test
    void testRomanToInt3() {
        assertThat(romanToInt("MCMXCIV")).isEqualTo(NUMBER_1994);
    }



}