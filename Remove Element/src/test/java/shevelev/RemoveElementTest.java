package shevelev;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.RemoveElement.removeElement;

class RemoveElementTest {
    int[] arr1Before = new int[] {2, 3, 4, 4, 3, 6};
    int[] arr1After = new int[] {2, 4, 4, 6, 3, 6};

    int[] arr2Before = new int[] {3, 2, 4, 4, 9, 3};
    int[] arr2After = new int[] {2, 4, 4, 9, 9, 3};

    int[] arr3Before = new int[] {2, 7, 4, 4, 9, 6};
    int[] arr3After = new int[] {2, 7, 4, 4, 9, 6};

    int[] arr4Before = new int[] {3, 3, 3, 3, 3, 3};
    int[] arr4After = new int[] {3, 3, 3, 3, 3, 3};

    int[] arr5Before = new int[] {};
    int[] arr5After = new int[] {};


    @Test
    void removeElementTest1() {
        assertThat(removeElement(arr1Before, 3)).isEqualTo(4);
        assertThat(compareArr(arr1Before, arr1After, 3)).isTrue();
    }

    @Test
    void removeElementTest2() {
        assertThat(removeElement(arr2Before, 3)).isEqualTo(4);
        assertThat(compareArr(arr2Before, arr2After, 3)).isTrue();
    }

    @Test
    void removeElementTest3() {
        assertThat(removeElement(arr3Before, 3)).isEqualTo(6);
        assertThat(compareArr(arr3Before, arr3After, 3)).isTrue();
    }

    @Test
    void removeElementTest4() {
        assertThat(removeElement(arr4Before, 3)).isEqualTo(0);
        assertThat(compareArr(arr4Before, arr4After, 3)).isTrue();
    }

    @Test
    void removeElementTest5() {
        assertThat(removeElement(arr5Before, 3)).isEqualTo(0);
        assertThat(compareArr(arr5Before, arr5After, 3)).isTrue();
    }

    private static boolean compareArr(int[] arrBefore, int[] arrAfter, int val) {
        if (Arrays.equals(arrBefore, arrAfter)) {
            return  true;
        }
        for (var i = 0; i < val; i++) {
            if (arrBefore[i] != arrAfter[i]) {
                return false;
            }
        }
        return true;
    }
}