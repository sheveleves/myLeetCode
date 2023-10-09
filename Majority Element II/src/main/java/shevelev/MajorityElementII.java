package shevelev;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] > nums[i]) {
                    int a = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = a;
                    flag = true;
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        double count = 1;
        int i = 1;
        while (i <= nums.length) {

            if (i < nums.length && nums[i - 1] == nums[i]) {
                count++;
                i++;
            } else {
                if (count > nums.length / 3.0) {
                    res.add(nums[i - 1]);
                }
                count = 1;
                i++;
            }
        }
        return res;

    }
}

