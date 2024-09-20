package shevelev;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public int longestSquareStreak(int[] nums) {
        //contains numbers from a given array which sorted by minimum square root
        Map<Integer, Set<Integer>> containNum = new HashMap<>();
        //contains numbers of elements from given array, that can be obtained by squaring their smallest square root value
        Map<Integer, Integer> minimumSRinContainMap = new HashMap<>();
        Set<Integer> finler = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (finler.contains(num)) {
                continue;
            }
            finler.add(num);
            int sr = minSR(num);
            if (!containNum.containsKey(sr)) {
                Set<Integer> integers = new TreeSet<>();
                containNum.put(sr, integers);
                minimumSRinContainMap.put(sr, num);
            }

            Set<Integer> integers = containNum.get(sr);
//            integers[0] = integers[0] + 1;
            integers.add(num);
            containNum.put(sr, integers);

            Integer min = minimumSRinContainMap.get(sr);
            if (min > num) {
                minimumSRinContainMap.put(sr, num);
            }
        }
        int result = -1;
        int numPrecededkey = 1;

        for (Map.Entry<Integer, Set<Integer>> entries : containNum.entrySet()) {
            Integer sr = entries.getKey();
            Set<Integer> values = entries.getValue();
            int countOfValues = values.size();
            if (countOfValues <= numPrecededkey) {
                continue;
            }
            int minForSR = minimumSRinContainMap.get(sr);
            int amount = 1;
            while (countOfValues > 1) {
                minForSR = minForSR * minForSR;
                if (values.contains(minForSR)) {
                    amount++;
                    countOfValues--;
                } else {
                    break;
                }
                numPrecededkey = countOfValues;
            }
            if (amount > 1 && result < amount) {
                result = amount;
            }
        }
        return result;
    }


    int minSR(int num) {
        int sr = sr(num);
        if (sr == -1) {
            return num;
        }
        return minSR(sr);
    }

    //sr - square root (квадратный корень)
    int sr(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((long) mid * mid > (long) x) {
                end = mid - 1;
            } else if (mid * mid == x) {
                return mid;
            } else {
                start = mid + 1;
            }
        }

        //added for this issue
        if (end * end != x) {
            return -1;
        }
        return end;
    }
}
