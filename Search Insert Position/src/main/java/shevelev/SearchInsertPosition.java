package shevelev;

class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int index1 = 0;
        int index2 = nums.length - 1;
        int step = index2 - index1;

        for(;;) {
            if (target == nums[index2] || target == nums[index1]) {
                return target == nums[index2] ? index2 : index1;
            } else if ((index2 - index1) == 1) {
                break;
            }
            if (target < nums[index2] && target > nums[index1]) {
                index1 = index1 + (int) Math.ceil(step / 4.0);
                index2 = index2 - (int) Math.ceil(step / 4.0) + 1;
            } else if (target < nums[index2] && target < nums[index1]) {
                index2 = index1;
                index1 = index1 - step + step / 2;
            } else if (target > nums[index2]) {
                index1 = index2;
                index2 = index2 + step / 2;
            }
            step = (int) Math.ceil(step / 2.0);
        }
        return target < nums[index1] ? index1 : (target > nums[index2]) ? index2 + 1 : index1 + 1;
    }
}