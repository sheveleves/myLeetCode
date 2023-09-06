package shevelev;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.RemoveElement.removeElement;

class RemoveElementTest {
    int[] arr1 = new int[] {2, 3, 4, 4, 3, 6};
    int[] arr2 = new int[] {3, 2, 4, 4, 9, 3};
    int[] arr3 = new int[] {2, 7, 4, 4, 9, 6};
    int[] arr4 = new int[] {3, 3, 3, 3, 3, 3};
    int[] arr5 = new int[] {};

    @Test
    void removeElementTest1() {
        assertThat(removeElement(arr1, 3)).isEqualTo(4);
    }

    @Test
    void removeElementTest2() {
        assertThat(removeElement(arr2, 3)).isEqualTo(4);
    }

    @Test
    void removeElementTest3() {
        assertThat(removeElement(arr3, 3)).isEqualTo(6);
    }

    @Test
    void removeElementTest4() {
        assertThat(removeElement(arr4, 3)).isEqualTo(0);
    }

    @Test
    void removeElementTest5() {
        assertThat(removeElement(arr5, 3)).isEqualTo(0);
    }


}