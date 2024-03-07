package org.arrays;

import java.util.Arrays;

class CheckReArrange {

    public static void main(String[] args) {
        reArrange(new int[] {10, -1, 20, 4, 5, -9, -6});
    }

    public static void reArrange(int[] arr) {

        int[] result = new int[arr.length];

        int resultIndex = 0;

        for (int i : arr) {
            if (i < 0) {
                result[resultIndex++] = i;
            }
        }

        for (int j : arr) {
            if (j >= 0) {
                result[resultIndex++] = j;
            }
        }

//        System.out.println(Arrays.toString(result));
    }
}