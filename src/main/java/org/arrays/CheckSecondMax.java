package org.arrays;

class CheckSecondMax {

    public static void main(String[] args) {
        int[] arr = { 1, 9, 2, 3, 6, 7, 16, 32, 20 };
        int secondMax = findSecondMaximum(arr);
        System.out.println(secondMax);
    }

    public static int findSecondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }
        }

        return secondMax;
    }
}