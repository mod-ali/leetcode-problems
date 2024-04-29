package org.arrays;

import java.util.Arrays;

public class FindMissingNumberInArray {

    public static void main(String[] args) {
        System.out.println(findMissingNumberInArray(new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10}));
    }

    static int findMissingNumberInArray(int[] arr) {
        if (arr[0] <= 0) {
            return 0;
        }
        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int sum = Arrays.stream(arr).sum();
        return expectedSum - sum;
    }
}
