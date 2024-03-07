 /* Max created on 2/28/2024 inside the package - org.integers */

 package org.integers;

 public class ReverseInteger {

     public static void main(String[] args) {
         System.out.println(reverse(-123));
     }

     public static int reverse(int x) {

         int result = 0;
         while (x != 0) {
             int lastDigit = x % 10;
             if (result > (Integer.MAX_VALUE / 10) || result < (Integer.MIN_VALUE / 10)) {
                 return 0;
             }
             result = result * 10 + lastDigit;
             x /= 10;
         }

         return result;
     }

 }
