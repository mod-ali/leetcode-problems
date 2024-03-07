package org.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];

        for (int j = 1; j < numbers.length; j++) {
            numbers[j] = random.nextInt(100);
        }

        System.out.println("before " + Arrays.toString(numbers));

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("after " + Arrays.toString(numbers));

    }

    private static void quickSort(int[] array, int lowIndex, int highIndex) {

        if(lowIndex >= highIndex) { // base case
            return;
        }

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            // move forward until we get number greater than the pivot
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // move backward until we get number less than the pivot
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        // at this point, leftPointer = right pointer

        swap(array, leftPointer, highIndex);

        // recursively sort the subarray left to the leftPointer
        quickSort(array, lowIndex, leftPointer - 1);
        // recursively sort the subarray right to the leftPointer
        quickSort(array, leftPointer + 1, highIndex);
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
