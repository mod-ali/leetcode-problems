package org.arrays;

import java.util.Arrays;

public class CheckIfTwoArraysArePermutations {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 1, 2, 3, 4};
        System.out.println(permutation(array1, array2));
        System.out.println(permutationWithoutSorting(array1, array2));
    }

    public static boolean permutation(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static boolean permutationWithoutSorting(int[] array1, int[] array2) {
        int sum1 = Arrays.stream(array1).sum();
        int sum2 = Arrays.stream(array2).sum();
        int mul1 = Arrays.stream(array1).reduce(1, (a, b) -> a * b);
        int mul2 = Arrays.stream(array2).reduce(1, (a, b) -> a * b);

        return sum1 == sum2 && mul1 == mul2;
    }
}
