package org.arrays;

import java.util.Arrays;

class FindMaxSums {

    public static void main(String[] args) {
        int maxSumSubArray = findMaxSumSubArray(new int[] { 1, 7, -2, -5, 10, -1} );

        System.out.println(maxSumSubArray);
    }

    public static int findMaxSumSubArray(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }

        int currMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currMax < 0) { // neg
                currMax = arr[i];
            } else { // pos
                currMax += arr[i];
            }

            if (currMax > globalMax) {
                globalMax = currMax;
            }
        }
        return globalMax;
    }
}