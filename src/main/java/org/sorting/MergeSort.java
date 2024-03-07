/* Max created on 3/18/2023 inside the package - org.org.sorting */

package org.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];

        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = random.nextInt(10000);
        }

        System.out.println("before " + Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println("after " + Arrays.toString(numbers));

    }

    private static void mergeSort(int[] arr) {
        int arrLength = arr.length;
        if (arrLength < 2) {
            return;
        }

        int midIndex = arrLength / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = arr[i];
        }

        for (int i = midIndex; i < arrLength; i++) {
            rightHalf[i - midIndex] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);

    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

}
