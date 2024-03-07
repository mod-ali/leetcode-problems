package org.arrays;

import java.util.Arrays;

class MyProductArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] product = findProduct(arr);

        System.out.println(Arrays.toString(product));
    }

    public static int[] findProduct(int arr[]) {
        int[] result = new int[arr.length];

        int j = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (k != i) {
                    product *= arr[k];
                }
            }
            result[i] = product;
            product = 1;
        }

        return result;
    }

} 
