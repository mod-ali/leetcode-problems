package org.arrays;

import java.util.Arrays;

class CheckMaxMinSorted {

    // Array before min/max: 1 2 3 4 5 6 
    // Array after min/max: 6 1 5 2 4 3 

    public static void main(String[] args) {
        maxMin(new int[] { 1, 2, 3, 4, 5, 6 });
    }

    public static void maxMin(int[] arr) {

        int[] result = new int[arr.length];

        int start = 0;
        int end = arr.length - 1;
        boolean switchPointers = true;

        for (int i = 0; i < result.length; i++) {
            if (switchPointers) {
                result[i] = arr[end--];
            } else {
                result[i] = arr[start++];
            }
            switchPointers = !switchPointers;
        }

        System.out.println(Arrays.toString(result));
    }
}