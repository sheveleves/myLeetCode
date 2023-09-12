package shevelev;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int lenArr = nums.length;
        int count = 1;
        int item = nums[0];
        int k = 0;
        for (var i = 1; i < lenArr; ) {
            while (nums[i] == item) {

                if (i == nums.length - 1) {
                    return count;
                }
                i++;
            }
            k++;
            nums[k] = nums[i];
            item = nums[k];
            count++;
            i++;
        }
        return count;
    }
}
