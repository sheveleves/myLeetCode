package shevelev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.RemoveDuplicates.removeDuplicates;

class RemoveDuplicatesTest {
    int[] arr1Before = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int[] arr1After = new int[] {0, 1, 2, 3, 4, 5, 2, 2, 3, 3, 4};

    int[] arr2Before = new int[] {3, 4, 5, 6, 7, 8};
    int[] arr2After = new int[] {3, 4, 5, 6, 7, 8};

    int[] arr3Before = new int[] {2, 2, 2, 2, 2, 2};
    int[] arr3After = new int[] {2, 2, 2, 2, 2, 2};

    int[] arr4Before = new int[]{};
    int[] arr4After = new int[]{};

    @Test
    void removeDuplicatesTest1() {
        assertThat(removeDuplicates(arr1Before)).isEqualTo(5);
        assertThat(compareArr(arr1Before, arr1After, 5)).isTrue();
    }

    @Test
    void removeDuplicatesTest2() {
        assertThat(removeDuplicates(arr2Before)).isEqualTo(6);
        assertThat(compareArr(arr2Before, arr2After, 6)).isTrue();
    }

    @Test
    void removeDuplicatesTest3() {
        assertThat(removeDuplicates(arr3Before)).isEqualTo(1);
        assertThat(compareArr(arr3Before, arr3After, 1)).isTrue();
    }

    @Test
    void removeDuplicatesTest4() {
        assertThat(removeDuplicates(arr4Before)).isEqualTo(0);
        assertThat(compareArr(arr4Before, arr4After, 0)).isTrue();
    }

    private static boolean compareArr(int[] arrBefore, int[] arrAfter, int val) {
        if (Arrays.equals(arrBefore, arrAfter)) {
            return true;
        }
        for (var i = 0; i < val; i++) {
            if (arrBefore[i] != arrAfter[i]) {
                return false;
            }
        }
        return true;
    }

}