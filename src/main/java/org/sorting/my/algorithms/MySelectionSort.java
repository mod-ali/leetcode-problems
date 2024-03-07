package org.sorting.my.algorithms;

import java.util.Arrays;
import java.util.Random;

import org.sorting.Helper;

// O(n2)
public class MySelectionSort {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];

        for (int j = 1; j < numbers.length; j++) {
            numbers[j] = random.nextInt(100);
        }

        System.out.println("before " + Arrays.toString(numbers));

        selectionSort(numbers);

        System.out.println("after " + Arrays.toString(numbers));

    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndx = j;
                }
            }

            swap(array, i, minIndx);
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
