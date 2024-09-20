package shevelev;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class longestSquareSteakInArrayTests {
    Solution solution = new Solution();


    @Test
    void extraCharactersInAStringTest1() {
        int[] nums = {4, 3, 6, 16, 8, 2};
        assertThat(solution.longestSquareStreak(nums)).isEqualTo(3);
    }

    @Test
    void extraCharactersInAStringTest2() {
        int[] nums = {2, 3, 5, 6, 7};
        assertThat(solution.longestSquareStreak(nums)).isEqualTo(-1);
    }

    @Test
    void extraCharactersInAStringTest3() {
        int[] nums = {2, 3, 5, 6, 7, 65536};
        assertThat(solution.longestSquareStreak(nums)).isEqualTo(-1);
    }

    @Test
    void extraCharactersInAStringTest4() {
        int[] nums = {6561, 2, 5, 6, 7, 3};
        assertThat(solution.longestSquareStreak(nums)).isEqualTo(-1);
    }

    @Test
    void extraCharactersInAStringTest5() {
        int[] nums = {6562, 2, 5, 6, 7, 3};
        assertThat(solution.longestSquareStreak(nums)).isEqualTo(-1);
    }

    @Test
    void extraCharactersInAStringTest6() {
        int[] nums = {25, 625, 6, 7, 10, 3125, 15625};
        assertThat(solution.longestSquareStreak(nums)).isEqualTo(2);
    }

    @Test
    void extraCharactersInAStringTest7() {
        int[] nums = {2, 2};
        assertThat(solution.longestSquareStreak(nums)).isEqualTo(-1);
    }

    @Test
    void extraCharactersInAStringTest8() {
        int[] nums = {5,4,5,2,3};
        assertThat(solution.longestSquareStreak(nums)).isEqualTo(2);
    }

    @Test
    void extraCharactersInAStringTest9() {
        int[] nums = {5,4,5,2,3,25,16,9,81,6561};
        assertThat(solution.longestSquareStreak(nums)).isEqualTo(4);
    }

    @Test
    void extraCharactersInAStringTest10() {
        int[] nums = {5,4,5,2,3,9,16};
        assertThat(solution.longestSquareStreak(nums)).isEqualTo(3);
    }

    @Test
    void extraCharactersInAStringTest11() {
        int[] nums = {46834,46834,46834,46834,57108,97164,81721,45377,92703,48384,21549,61013,11033,99084,43314,8166,64049,53896,6737,17343,83780,87639,87775,24222,74545,99321,39403,40718,28648,94400,85864,2228,50614,5537,27726,20543,72705,10808,79752,55257,85572,70763,32447,51332,33123,84768,78997,3591,72989,36395,90974,82584,65044,33882,24777,89361};
        assertThat(solution.longestSquareStreak(nums)).isEqualTo(-1);
    }
}
