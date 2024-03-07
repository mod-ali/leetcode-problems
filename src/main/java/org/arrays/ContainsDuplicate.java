 /* Max created on 3/18/2023 inside the package - org.arrays */

 package org.arrays;

 import java.util.Arrays;

 public class ContainsDuplicate {

     public static void main(String[] args) {
         boolean b = containsDuplicate(new int[] { 1, 3, 6, 4, 9, 2, 10, 1 });

         System.out.println(b);

     }

     public static boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums);
         for (int i = 0; i < nums.length -1; i++) {
             if (nums[i] == nums[i + 1]) {
                 return true;
             }
         }
         return false;
     }
 }
