 /* Max created on 3/24/2023 inside the package - org.sorting */

 package org.sorting;

 import java.util.Arrays;
 import java.util.Random;

 // O(n2)
 public class SelectionSort {

     public static void main(String[] args) {

         Random random = new Random();

         int[] numbers = new int[10];

         for (int j = 1; j < numbers.length; j++) {
             numbers[j] = random.nextInt(100);
         }

         System.out.println("before " + Arrays.toString(numbers));

         selectionSort(numbers);

         System.out.println("after " + Arrays.toString(numbers));

     }

     private static void selectionSort(int[] array) {

         for (int i = 0; i < array.length - 1; i++) {

             //3 1 5 8 2 10
             int min = array[i];
             int indexOfMin = i;

             for (int j = i + 1; j < array.length; j++) {
                 if (array[j] < min) {
                     min = array[j];
                     indexOfMin = j;
                 }
             }

             swap(array, i, indexOfMin);
         }
     }

     private static void swap(int[] array, int a, int b) {
         int temp = array[a];
         array[a] = array[b];
         array[b] = temp;
     }

 }
