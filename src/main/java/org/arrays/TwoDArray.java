package org.arrays;

import java.util.Arrays;

class TwoDArray {
    public static void main(String args[]) {

        int[] arr = {1, 2, 4, 5, 10, 6, 3};
        int[] ints = removeEven(arr);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] removeEven(int[] arr) {

        int oddNumCount = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                oddNumCount++;
            }
        }

        int[] oddArr = new int[oddNumCount];

        int restlArrIndex = 0;

        for (int j : arr) {
            if (j % 2 != 0) {
                oddArr[restlArrIndex++] = j;
            }
        }

        return oddArr;
    }

}
