package shevelev;

public class Solution {
    public static int cow(int n, int[] memo) {
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = cow(n - 1, memo) + cow(n - 2, memo);
        return memo[n];
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        return cow(n, memo);
    }
}
