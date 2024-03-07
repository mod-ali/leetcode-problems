 /* Max created on 3/19/2023 inside the package - org.org */

 package org.search;

 public class BinarySearch {

     public static void main(String args[]) {
         int arr[] = { -100, 0, 0, 1, 4, 4, 5, 5, 95, 200 };
         int arrSize = 10;
         int key = 95;
         int index = binarySearch(key, arr, arrSize);


         if (index != -1) {
             System.out.println("Your Key \"" + key + "\" is found at index \"" + index + "\"");
         } else {
             System.out.println("Your Key \"" + key + "\" not found in the array: ");
         }

     }

     public static int binarySearch(int s, int[] arr, int arrSize) {
         if (arrSize <= 0) // Sanity check
         {
             return -1;
         }

         if (arrSize == 1) {
             if (arr[0] == s) {
                 return 0;
             } else {
                 return -1;
             }
         }

         //1 2 3 4 5 6 7
         int start = 0;
         int end = arrSize - 1;
         int mid;

         while (start <= end) {
             mid = (start + end) / 2;

             if (arr[mid] < s) {
                 start = mid + 1;
             } else if (arr[mid] > s) {
                 end = mid - 1;
             } else {
                 return mid;
             }
         }

         return -1; // Return -1 otherwise
     }

 }
