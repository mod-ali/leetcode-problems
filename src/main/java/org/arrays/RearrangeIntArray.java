/* Max created on 3/5/2024 inside the package - org.arrays */

package org.arrays;

import java.util.Arrays;

public class RearrangeIntArray {
    /*
        Given an integer, re-arrange the integer such that first and last digit will be at first and second, second and second last digit will be at third and fourth position from left of the re-arranges integer and so on.

                Example:

        Input -> 12345678, Output -> 18273645

        Input -> 1234567, Output -> 1726354

     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reArrangeMinToMax(new int[]{1, 2, 3, 4, 5, 6, 7, 8})));
    }


    static int[] reArrangeMinToMax(int[] arr) {

        int small = 0;
        int large = arr.length - 1;

        int[] arranged = new int[arr.length];
        for (int i = 0; i < arranged.length; i++) {
            arranged[i] = arr[small];
            arranged[++i] = arr[large];
            small++;
            large--;
        }

        return arranged;
    }
}
