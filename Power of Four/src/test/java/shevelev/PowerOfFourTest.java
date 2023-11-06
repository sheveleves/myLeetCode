package shevelev;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PowerOfFourTest {
    //true
    int n1 = 1;
    int n2 = 16;
    int n3 = 64;
    int n4 = 1024;
    //false
    int n5 = 0;
    int n6 = 17;
    int n7 = 32;


    @Test
    void testPowerOfFour1() {
        assertThat(PowerOfFour.isPowerOfFour(n1)).isTrue();
    }
    @Test
    void testPowerOfFour2() {
        assertThat(PowerOfFour.isPowerOfFour(n2)).isTrue();
    }
    @Test
    void testPowerOfFour3() {
        assertThat(PowerOfFour.isPowerOfFour(n3)).isTrue();
    }
    @Test
    void testPowerOfFour4() {
        assertThat(PowerOfFour.isPowerOfFour(n4)).isTrue();
    }
    @Test
    void testPowerOfFour5() {
        assertThat(PowerOfFour.isPowerOfFour(n5)).isFalse();
    }
    @Test
    void testPowerOfFour6() {
        assertThat(PowerOfFour.isPowerOfFour(n6)).isFalse();
    }
    @Test
    void testPowerOfFour7() {
        assertThat(PowerOfFour.isPowerOfFour(n7)).isFalse();
    }
}