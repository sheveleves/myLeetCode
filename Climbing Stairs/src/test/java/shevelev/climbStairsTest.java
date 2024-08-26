package shevelev;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class climbStairsTest {
    static int[] result = new int[46];
    static int[] stairs = new int[]{1, 16, 20, 27, 35, 45};

    @BeforeAll
    static void initResult() {
        result[1] = 1;
        result[16] = 1597;
        result[20] = 10946;
        result[27] = 317811;
        result[35] = 14930352;
        result[45] = 1836311903;
    }


    @Test
    void sqrtTest() {
        for (int i = 0; i < 6; i += 1) {
            int stair = stairs[i];
            assertThat(Solution.climbStairs(stair)).isEqualTo(result[stair]);
        }
    }
}
