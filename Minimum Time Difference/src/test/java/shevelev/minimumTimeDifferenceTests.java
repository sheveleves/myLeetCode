package shevelev;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class minimumTimeDifferenceTests {
    private static List<String> timePoints = new ArrayList<>();

    @BeforeEach
    void cleanTimePoints() {
        timePoints.clear();
    }


    @Test
    void minimumTimeDifferenceTest1() {

        timePoints.add("23:59");
        timePoints.add("00:00");
        int diff = Solution.findMindDifference(timePoints);
        assertThat(diff).isEqualTo(1);
    }

    @Test
    void minimumTimeDifferenceTest2() {
        timePoints.add("00:00");
        timePoints.add("04:00");
        timePoints.add("22:00");
        timePoints.add("23:00");
        int diff = Solution.findMindDifference(timePoints);
        assertThat(diff).isEqualTo(60);
    }

    @Test
    void minimumTimeDifferenceTest3() {
        timePoints.add("00:00");
        timePoints.add("04:00");
        timePoints.add("04:07");
        timePoints.add("22:00");
        timePoints.add("23:00");
        int diff = Solution.findMindDifference(timePoints);
        assertThat(diff).isEqualTo(7);
    }
}
