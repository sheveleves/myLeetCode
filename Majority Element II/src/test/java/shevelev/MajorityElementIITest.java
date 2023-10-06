package shevelev;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MajorityElementIITest {
    int[] arr1 = {3, 2, 3};
    int[] arr2 = {1};
    int[] arr3 = {1, 2};
    int[] arr4 = {7, 7, 5, 7, 7, 6, 1, 2, 5};

    @Test
    void testMajorityElementII1() {
        assertThat(MajorityElementII.majorityElement(arr1)).isEqualTo(List.of(3));
    }
    @Test
    void testMajorityElementII2() {
        assertThat(MajorityElementII.majorityElement(arr2)).isEqualTo(List.of(1));
    }
    @Test
    void testMajorityElementII3() {
        assertThat(MajorityElementII.majorityElement(arr3)).isEqualTo(List.of(1, 2));
    }
    @Test
    void testMajorityElementII4() {
        assertThat(MajorityElementII.majorityElement(arr4)).isEqualTo(List.of(7));
    }
}