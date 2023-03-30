package shevelev;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        int k = 1;
        int sum;

        while (i < nums.length) {
            sum = nums[i] + nums[k];
            if (sum == target) {
                result[0] = i;
                result[1] = k;
                return result;
            }
            k++;
            if (k == nums.length) {
                i++;
                k = i + 1;
            }
        }
        return result;
    }
}
