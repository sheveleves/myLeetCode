package shevelev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int countDays(int days, int[][] meetings) {
        TreeSet<int[]> set = new TreeSet<>((o1, o2) -> {
            if (o1[0] != o2[0]) {
                return Integer.compare(o1[0], o2[0]);
            }
            int i1 = o1[1] - o1[0];
            int i2 = o2[1] - o2[0];
            return Integer.compare(i2, i1);
        });
        set.add(meetings[0]);

        for (int i = 1; i < meetings.length; i++) {
            int[] meet = meetings[i];
            set.add(meet);
            mergeInterval(set);
        }

        int result = 0;
        for (int[] interval : set) {
            result += (interval[1] - interval[0] + 1);
        }

        return days - result;
    }

    public Set<int[]> mergeInterval(Set<int[]> set) {
        if (set.isEmpty()) {
            return set;
        }

        int startSize = -1;

        List<int[]> toRemove = new ArrayList<>();
        List<int[]> toAdd = new ArrayList<>();

        while (startSize != set.size()) {
            startSize = set.size();

            if (set.size() == 1) {
                return set;
            }

            Iterator<int[]> iterator = set.iterator();
            int[] next1 = iterator.next();
            while (iterator.hasNext()) {
                int[] next2 = iterator.next();
                if (merge(next1, next2)) {
                    toRemove.addAll(Arrays.asList(next1, next2));
                    next1 = new int[]{Math.min(next1[0], next2[0]), Math.max(next1[1], next2[1])};
                    toAdd.add(next1);
                } else {
                    next1 = next2;
                }
            }

            set.removeAll(toRemove);
            set.addAll(toAdd);
            toRemove.clear();
            toAdd.clear();
        }

        return set;
    }

    public boolean merge(int[] a, int[] b) {
        int start1 = a[0];
        int end1 = a[1];
        int start2 = b[0];
        int end2 = b[1];
        return (start1 <= end2 + 1) && (end1 + 1 >= start2);
    }
}