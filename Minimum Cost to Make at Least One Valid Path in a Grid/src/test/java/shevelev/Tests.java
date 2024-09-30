package shevelev;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Tests {
    Solution solution = new Solution();

    @Test
    void Test1() {
        int[][] grid = {{1}, {1}, {1}, {1}}; //3
        assertThat(solution.minCost(grid)).isEqualTo(3);
    }

    @Test
    void Test2() {
        int[][] grid = {{4}, {4}, {4}, {4}}; //3
        assertThat(solution.minCost(grid)).isEqualTo(3);
    }

    @Test
    void Test3() {
        int[][] grid = {{1, 1}, {1, 1}, {1, 1}, {1, 1}}; //3
        assertThat(solution.minCost(grid)).isEqualTo(3);
    }

    @Test
    void Test4() {
        int[][] grid = {{1, 1, 1, 1}, {2, 2, 2, 2}, {1, 1, 1, 1}, {2, 2, 2, 2}}; //3
        assertThat(solution.minCost(grid)).isEqualTo(3);
    }

    @Test
    void Test5() {
        int[][] grid = {{3, 1, 3, 1}, {1, 4, 3, 1}, {3, 2, 2, 1}, {1, 1, 1, 4}}; //0
        assertThat(solution.minCost(grid)).isEqualTo(0);
    }

    @Test
    void Test6() {
        int[][] grid = {{3, 4, 3}, {2, 2, 2}, {2, 1, 1}, {4, 3, 2}, {2, 1, 4}, {2, 4, 1}, {3, 3, 3}, {1, 4, 2}, {2, 2, 1}, {2, 1, 1}, {3, 3, 1}, {4, 1, 4}, {2, 1, 4}, {3, 2, 2}, {3, 3, 1}, {4, 4, 1}, {1, 2, 2}, {1, 1, 1}, {1, 3, 4}, {1, 2, 1}, {2, 2, 4}, {2, 1, 3}, {1, 2, 1}, {4, 3, 2}, {3, 3, 4}, {2, 2, 1}, {3, 4, 3}, {4, 2, 3}, {4, 4, 4}}; //18
        assertThat(solution.minCost(grid)).isEqualTo(18);
    }


}
