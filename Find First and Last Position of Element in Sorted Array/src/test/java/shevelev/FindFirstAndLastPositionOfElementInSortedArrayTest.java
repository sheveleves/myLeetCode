package shevelev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.FindFirstAndLastPositionOfElementInSortedArray.searchRange;

class FindFirstAndLastPositionOfElementInSortedArrayTest {
    int[] res = {-1, -1};

    int[] num1 = {5, 7, 7, 8, 8, 10};
    int[] res1 = {3,4};

    int[] num2 = {5, 7, 7, 8, 8, 8, 8, 8, 10};
    int[] res2 = {3,7};
    int[] num3 = {};

    int[] num4 = {1, 1, 5, 7, 7, 8, 8, 8, 8, 8, 10};
    int[] res4 = {0, 1};

    int[] num5 = {1};
    int[] res5 = {0};
    int[] num6 = {1};
    int[] res6 = {0};


    @Test
    void testFindFirstAndLastPositionOfElementInSortedArray1() {
        assertThat(Arrays.equals(searchRange(num1, 8), res1)).isTrue();
    }
    @Test
    void testFindFirstAndLastPositionOfElementInSortedArray2() {
        assertThat(Arrays.equals(searchRange(num1, 6), res)).isTrue();
    }
    @Test
    void testFindFirstAndLastPositionOfElementInSortedArray3() {
        assertThat(Arrays.equals(searchRange(num2, 8), res2)).isTrue();
    }
    @Test
    void testFindFirstAndLastPositionOfElementInSortedArray4() {
        assertThat(Arrays.equals(searchRange(num3, 0), res)).isTrue();
    }
    @Test
    void testFindFirstAndLastPositionOfElementInSortedArray5() {
        assertThat(Arrays.equals(searchRange(num4, 1), res4)).isTrue();
    }
    @Test
    void testFindFirstAndLastPositionOfElementInSortedArray6() {
        assertThat(Arrays.equals(searchRange(num5, 0), res)).isTrue();
    }
    @Test
    void testFindFirstAndLastPositionOfElementInSortedArray7() {
        assertThat(Arrays.equals(searchRange(num5, 1), res)).isTrue();
    }
}