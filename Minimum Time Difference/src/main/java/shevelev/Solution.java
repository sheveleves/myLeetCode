package shevelev;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("00:00");
        timePoints.add("23:55");
//        timePoints.add("00:00");
//        timePoints.add("23:58");
        timePoints.add("10:02");
        timePoints.add("13:00");
        timePoints.add("00:10");

        timePoints.add("23:47");
        timePoints.add("00:22");

        int mindDifference = findMindDifference(timePoints);
        System.out.println(mindDifference);

    }


    public static int parse(String time) {
        String[] split = time.split(":");
        int hours = Integer.parseInt(split[0]);
        int seconds = Integer.parseInt(split[1]);
        return hours * 60 + seconds;
    }

    public static int findMindDifference(List<String> timePoints) {
        int[] sortArr = new int[24 * 60];
        boolean isZero = false;
        int minIndex = 23 * 60 + 59;
        int maxIndex = 1;
        for (String point : timePoints) {
            int secondsAndIndex = parse(point);
            if (isZero && secondsAndIndex == 0) {
                return 0;
            }
            if (secondsAndIndex == 0) {
                isZero = true;
                continue;
            }

            if (sortArr[secondsAndIndex] != 0) {
                return 0;
            } else {
                if (minIndex > secondsAndIndex) {
                    minIndex = secondsAndIndex;
                }
                if (maxIndex < secondsAndIndex) {
                    maxIndex = secondsAndIndex;
                }

                sortArr[secondsAndIndex] = secondsAndIndex;
            }
        }

        int diff;

        if (sortArr[maxIndex] - sortArr[minIndex] > 720) {
            diff = 24 * 60 - (sortArr[maxIndex] - sortArr[minIndex]);
        } else {
            diff = sortArr[maxIndex] - sortArr[minIndex];
        }

        if (isZero) {
            if (24 * 60 - sortArr[maxIndex] > sortArr[minIndex]) {
                diff = sortArr[minIndex];
            } else {
                diff = 24 * 60 - sortArr[maxIndex];
            }
        }

        int previousSeconds = sortArr[minIndex];
        while (minIndex < maxIndex) {
            if (sortArr[minIndex + 1] == 0) {
                minIndex++;
                continue;
            }
            if (sortArr[minIndex + 1] - previousSeconds < diff) {
                diff = sortArr[minIndex + 1] - previousSeconds;
            }
            if (diff == 1) {
                return 1;
            }
            previousSeconds = sortArr[minIndex + 1];
            minIndex++;
        }

        return diff;
    }
}
