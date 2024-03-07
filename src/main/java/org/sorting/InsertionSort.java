package org.sorting;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[] { 3, 1, 8, 2, 10, 0 };

        System.out.println("before " + Arrays.toString(numbers));

        insertionSort(numbers);

        System.out.println("after " + Arrays.toString(numbers));

    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            // 3 1 8 6 2 0

            int currentVal = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentVal) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentVal;
        }
    }

}
