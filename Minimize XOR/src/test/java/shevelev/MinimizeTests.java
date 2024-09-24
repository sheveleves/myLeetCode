package shevelev;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class MinimizeTests {
    Solution solution = new Solution();
    int num1;
    int num2;

    @Test
    void extraCharactersInAStringTest1() {
        num1 = 3;
        num2 = 5;
        assertThat(solution.minimizeXor(num1, num2)).isEqualTo(3);
    }

    @Test
    void extraCharactersInAStringTest2() {
        num1 = 1;
        num2 = 12;
        assertThat(solution.minimizeXor(num1, num2)).isEqualTo(3);
    }

    @Test
    void extraCharactersInAStringTest3() {
        num1 = 6133;
        num2 = 5820;
        assertThat(solution.minimizeXor(num1, num2)).isEqualTo(6128);
    }

    @Test
    void extraCharactersInAStringTest4() {
        num1 = 5820;
        num2 = 6133;
        assertThat(solution.minimizeXor(num1, num2)).isEqualTo(5823);
    }

    @Test
    void extraCharactersInAStringTest5() {
        num1 = 65;
        num2 = 84;
        assertThat(solution.minimizeXor(num1, num2)).isEqualTo(67);
    }
}
