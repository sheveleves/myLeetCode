package shevelev;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int length = nums.length;
        if (length == 0) {
            return res;
        }
        int cut0 = length;
        int cut1 = length / 2;
        boolean flag = true;
        while (flag) {
            if (cut1 == length) {
                return res;
            }
            if (target < nums[cut1]) {
                if (cut1 == 0) {
                    return res;
                }
                cut0 = cut1;
                cut1 /= 2;
            } else if (target > nums[cut1]) {
                if ((cut0 - cut1) == 1) {
                    return new int[] {-1, -1};
                }
                cut1 = cut1 + (int) Math.ceil((cut0 - cut1) / 2);
            } else {
                int index = cut1;
                boolean flag2 = true;
                while (flag2) {
                    flag = false;
                    if (res[0] == -1 && index != 0 && target == nums[index - 1]) {
                        index = index - 1;
                    } else {
                        res[0] = index;
                        flag2 = false;
                    }
                }
                flag2 = true;
                while (flag2) {
                    if (res[1] == -1 && cut1 < length - 1 && target == nums[cut1 + 1]) {
                        cut1 = cut1 + 1;
                    } else {
                        res[1] = cut1;
                        flag2 = false;
                    }
                }
            }
        }
        return res;
    }
}

