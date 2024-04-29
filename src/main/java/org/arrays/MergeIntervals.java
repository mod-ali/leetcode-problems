package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nikoo28 on 11/8/19 12:58 AM
 */

class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{0, 3}, {2, 5}, {1, 9}, {19, 20}, {10, 11}, {12, 20}, {0, 1}, {0, 2}};
        int[][] merge = merge(intervals);
//        System.out.println(Arrays.toString(merge));
    }

    static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // Sort by ascending starting point

        Arrays.sort(intervals, Comparator.comparingInt(value -> value[0]));
        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);
        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

}