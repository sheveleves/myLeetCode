package shevelev;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static shevelev.MaximumNumberofCoinsYouCanGet.maxCoins;

class MaximumNumberofCoinsYouCanGetTest {
    int[] arr1 = {2, 4, 1, 2, 7, 8};
    int[] arr2 = {2, 4, 5};
    int[] arr3 = {9,8,7,6,5,1,2,3,4};


    @Test
    void maxCoins1() {
        assertThat(maxCoins(arr1)).isEqualTo(9);
    }

    @Test
    void maxCoins2() {
        assertThat(maxCoins(arr2)).isEqualTo(4);
    }

    @Test
    void maxCoins3() {
        assertThat(maxCoins(arr3)).isEqualTo(18);
    }




}