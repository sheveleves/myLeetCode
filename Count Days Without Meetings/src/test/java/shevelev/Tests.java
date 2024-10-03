package shevelev;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Tests {
    Solution solution = new Solution();

    @Test
    void Test1() {
        int days = 5;
        int[][] meetings = {{2, 4}, {1, 3}}; //3
        assertThat(solution.countDays(days, meetings)).isEqualTo(1);
    }

    @Test
    void Test2() {
        int days = 10;
        int[][] meetings = {{5, 7}, {1, 3}, {9, 10}}; //3
        assertThat(solution.countDays(days, meetings)).isEqualTo(2);
    }

    @Test
    void Test3() {
        int days = 6;
        int[][] meetings = {{1, 6}}; //3
        assertThat(solution.countDays(days, meetings)).isEqualTo(0);
    }

    @Test
    void Test4() {
        int days = 33;
        int[][] meetings = {{3, 9}, {7, 16}, {21, 23}, {22, 33}, {5, 13}, {10, 23}, {1, 15}};
        assertThat(solution.countDays(days, meetings)).isEqualTo(0);
    }

    @Test
    void Test5() {
        int days = 13;
        int[][] meetings = {{13, 13}, {5, 7}, {6, 11}, {3, 8}}; //3
        assertThat(solution.countDays(days, meetings)).isEqualTo(3);
    }

    @Test
    void Test6() {
        int days = 17;
        int[][] meetings = {{15, 15}, {3, 12}, {5, 12}, {7, 8}}; //6
        assertThat(solution.countDays(days, meetings)).isEqualTo(6);
    }
}
