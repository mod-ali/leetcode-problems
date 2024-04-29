package org.arrays;

import java.util.Arrays;

public class FindPartition {


    public static void main(String[] args) {
        getHIghestAndLowest();

    }


    public static int[] getHIghestAndLowest() {

        int[] arr = {5, -1, 3, 8, 6};
        int n = arr.length;
        int[] arrCopy = Arrays.copyOf(arr, n);
        Arrays.sort(arrCopy);

        int middle = n / 2;

        int[] leftSide = Arrays.copyOfRange(arrCopy, 0, middle);
        int[] rightSide = Arrays.copyOfRange(arrCopy, middle, n);

        System.out.println(Arrays.toString(leftSide));
        System.out.println(Arrays.toString(rightSide));
        return null;
    }
}