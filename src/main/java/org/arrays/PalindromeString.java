 /* Max created on 3/11/2023 inside the package - org.arrays */

 package org.arrays;

 //Given a string s, return the longest palindromic substring in s.
 public class PalindromeString {

     public static void main(String[] args) {
         String s = "aaaabbaaaa";
         boolean b = checkPalindrome(s);
         System.out.println(b);

     }

     public static boolean checkPalindrome(String s) {
         char[] charArr = s.toCharArray();

         int mid = charArr.length / 2;

         int i = 0;
         int j = charArr.length - 1;

         while (i <= mid) {
             if (charArr[i] != charArr[j]) {
                 return false;
             }
             i++;
             j--;
         }

         return true;

     }
 }
