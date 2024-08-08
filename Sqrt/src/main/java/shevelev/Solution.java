package shevelev;


public class Solution

{
    public static int mySqrt(int x) {
        long sqrtMin = x / 2;
        long sqrtMax = x;
        long i = sqrtMin * sqrtMin;
        while (sqrtMin > 655360 || (sqrtMin * sqrtMin) > x) {
            sqrtMax = sqrtMin;
            sqrtMin = sqrtMin / 2;
        }
        while (true) {
            long diff = (sqrtMax - sqrtMin) / 2;
            if (diff == 0) {
                diff = 1;
            }
            sqrtMin = sqrtMin + diff;
            if ((sqrtMin * sqrtMin) > x) {
                if (diff == 1) {
                    return (int) sqrtMin - 1;
                }
                sqrtMax = sqrtMin;
                sqrtMin = sqrtMin - diff;
            }
        }
    }
}
