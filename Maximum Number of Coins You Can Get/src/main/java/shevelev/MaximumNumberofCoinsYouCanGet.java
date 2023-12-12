package shevelev;

import java.util.Arrays;

public class MaximumNumberofCoinsYouCanGet {
    public static int maxCoins(int[] piles) {
        if (piles.length == 0) {
            return 0;
        }
        Arrays.sort(piles);
        int countChoose = piles.length / 3;
        int i = piles.length - 2;

        int ans = 0;
        while(countChoose > 0) {
            ans = ans  + piles[i];
            i = i - 2;
            countChoose = countChoose - 1;
        }
        return ans;
    }
}
