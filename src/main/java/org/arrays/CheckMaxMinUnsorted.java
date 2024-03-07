package org.arrays;

import java.util.Arrays;

class CheckMaxMinUnsorted {

    public static void main(String[] args) {
        maxMin(new int[] { 20, 1, 2, 10, 3, 4, 5 , 110});
    }

    public static void maxMin(int[] arr) {

        int[] result = new int[arr.length];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i < min) {
                min = i;
            }

            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }
        }

        result[0] = max;
        result[1] = min;
        result[2] = secondMax;
        int i = 3;
        int j = 0;
        while(i < result.length) {
            if(arr[j] != max && arr[j] != min && arr[j] != secondMax) {
                result[i] = arr[j];
                i++;
            }
            j++;
        }

        System.out.println("max: " + max + " min " + min + " second max " + secondMax);

        System.out.println(Arrays.toString(result));
    }
}