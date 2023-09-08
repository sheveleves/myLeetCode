package shevelev;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int lenArr = nums.length;
        int count = 0;
        int k = 0;
        for (var i = 0; i < lenArr; ) {
            while (nums[i] == val) {
                if (i == nums.length - 1) {
                    return count;
                }
                i++;
            }
            nums[k] = nums[i];
            count++;
            k++;
            i++;
        }
        return count;
    }
}
