package org.arrays;

class CheckSumQuickSort {

    static Helper obj = new Helper();

    public static int[] findSum(int[] arr, int n) //Returns 2 elements of arr that sum to the given value
    {
        //Helper sort function that uses the Quicksort Algorithm
        obj.quickSort(arr, 0, arr.length - 1); //Sort the array in Ascending Order

        int Pointer1 = 0; //Pointer 1 -> At Start
        int Pointer2 = arr.length - 1; //Pointer 2 -> At End

        int[] result = new int[2];

        int sum = 0;

        while (Pointer1 != Pointer2) {

            sum = arr[Pointer1] + arr[Pointer2]; //Calulate Sum of Pointer 1 and 2

            if (sum < n) {
                Pointer1++; //if sum is less than given value => Move Pointer 1 to Right
            } else if (sum > n) {
                Pointer2--;
            } else {
                result[0] = arr[Pointer1];
                result[1] = arr[Pointer2];
                return result; // containing 2 number
            }
        }
        return arr;
    }

    public static void main(String args[]) {

        int n = 9;
        int[] arr1 = { 2, 4, 5, 7, 8 };
        int[] arr2 = findSum(arr1, n);
        int num1 = arr2[0];
        int num2 = arr2[1];

        if ((num1 + num2) != n) {
            System.out.println("Results not found!");
        } else {
            System.out.println("Sum of " + n + " found: " + num1 + " and " + num2);
        }
    }
}