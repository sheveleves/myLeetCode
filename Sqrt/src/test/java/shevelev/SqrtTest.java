package shevelev;

import org.assertj.core.api.AbstractIntegerAssert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SqrtTest {




    @Test
    void sqrtTest() {
        for (int i = 0; (0 <= i) && (i <= Integer.MAX_VALUE); i += 1) {
            int sqrt = Solution.mySqrt(i);
            double sqrtCorrect = Math.sqrt((double) i);
            sqrtCorrect = Math.floor(sqrtCorrect);
            System.out.println(i);
            if (!(sqrt == sqrtCorrect)) {
                assertThat(sqrt).isEqualTo(sqrtCorrect);
//                break;
            }
        }
    }
}
