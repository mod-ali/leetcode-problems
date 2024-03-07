package org.sorting;

import java.util.*;

public class Helper {

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static int findMin(int[] arr, int start, int end) {
        if (end <= 0 || start < 0) {
            return 0;
        }

        int minInd = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <arr[minInd] ) {
                minInd = i;
            }
        }
        return minInd;
    }

    public int findMax(int[] arr, int start, int end) {
        if (end <= 0 || start < 0) {
            return 0;
        }

        int maxInd = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[maxInd] < arr[i]) {
                maxInd = i;
            }
        }
        return maxInd;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}