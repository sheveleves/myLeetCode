package shevelev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.TwoSum.twoSum;

class TwoSumTest {
    @Test
    void testTwoSum() {
        int[] nums = new int[] {3, 2, 3};
        int target = 6;
        int[] expected = new int[] {0, 2};
        assertThat(Arrays.equals(twoSum(nums, target), expected)).isTrue();
    }

    @Test
    void testTwoSum1() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[] {0, 1};
        assertThat(Arrays.equals(twoSum(nums, target), expected)).isTrue();
    }



}