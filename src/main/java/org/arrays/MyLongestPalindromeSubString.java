 /* Max created on 3/19/2023 inside the package - org.arrays */

 package org.arrays;

 public class MyLongestPalindromeSubString {

     public String longestPalindrome(String s) {

         int start = 0;
         int end = 0;
         int length = 0;

         for (int i = 0; i < s.length(); i++) {
             int odd = expand(s, i, i);
             int even = expand(s, i, i + 1);

             length = Math.max(odd, even);

             if (length > end - start) {
                 start = i - (length - 1) / 2;
                 end = i + length / 2;
             }
         }

         return s.substring(start, end +1);

     }

     private int expand(String s, int left, int right) {

         while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
             left--;
             right++;
         }

         return right - left - 1;
     }

 }
