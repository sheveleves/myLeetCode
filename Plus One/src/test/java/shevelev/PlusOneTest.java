package shevelev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.PlusOne.plusOne;

class PlusOneTest {
    int[] digits1 = {1, 2 , 3};
    int[] digits2 = {1, 2 , 9};
    int[] digits3 = {9, 2 , 9};
    int[] digits4 = {9, 9 , 9};
    int[] digits5 = {9};
    int[] digits6 = {8};





    @Test
    void plusOneTest1() {
        assertThat(Arrays.equals(plusOne(digits1), new int[]{1, 2, 4}));
    }
    @Test
    void plusOneTest2() {
        assertThat(Arrays.equals(plusOne(digits2), new int[]{1, 3, 0}));
    }
    @Test
    void plusOneTest3() {
        assertThat(Arrays.equals(plusOne(digits3), new int[]{9, 3, 0}));
    }
    @Test
    void plusOneTest4() {
        assertThat(Arrays.equals(plusOne(digits4), new int[]{1, 3, 0}));
    }
    @Test
    void plusOneTest5() {
        assertThat(Arrays.equals(plusOne(digits5), new int[]{1, 0}));
    }
    @Test
    void plusOneTest6() {
        assertThat(Arrays.equals(plusOne(digits6), new int[]{9}));
    }



}