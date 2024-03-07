package org.arrays;

import java.util.Arrays;

class CheckRotateArray {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 10 };

        int[] rotatedArray = rotateArray(arr);

        System.out.println(Arrays.toString(rotatedArray));
    }

    public static int[] rotateArray(int[] arr) {

        int lastElement = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i -1];
        }

        arr[0] = lastElement;

        return arr;
    }
}