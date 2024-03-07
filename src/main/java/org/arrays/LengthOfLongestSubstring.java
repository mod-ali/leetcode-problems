 /* Max created on 3/25/2023 inside the package - org.arrays */

 package org.arrays;

 import java.util.HashMap;
 import java.util.HashSet;
 import java.util.Map;
 import java.util.Set;

 public class LengthOfLongestSubstring {

     /*
          Input: s = "abcabcbb"
          Output: 3
          Explanation: The answer is "abc", with the length of 3.
     */

     public static void main(String[] args) {
         int length = lengthOfLongestSubstring("abcabcbb");

         System.out.println(length);

     }

     public static int lengthOfLongestSubstring(String s) {
         Set<Character> characterSet = new HashSet<>();

         char[] chars = s.toCharArray();

         int maxBackup = 0;
         for (int i = 0; i < chars.length; i++) {

             characterSet.add(chars[i]);

             int length = 1;

             for (int j = i + 1; j < chars.length - 1; j++) {
                 boolean added = characterSet.add(chars[j]);
                 if (!added) {
                     characterSet.clear();
                     break;
                 }

             }

             maxBackup = Math.max(maxBackup, length);

         }
         return maxBackup;
     }

     public static int enhancedLengthOfLongestSubstring(String s) {
         Map<Character, Integer> map = new HashMap<>();
         int left = 0;
         int right = 1;

         char[] c = s.toCharArray();

         int maxBackup = 0;
         for (int i = 0; i < c.length; i++) {
             if (map.get(c[i]) != null) {
                 left++;
                 maxBackup = 0;
             } else {
                 right++;
                 maxBackup++;
                 map.put(c[i], i);
             }

         }
         return maxBackup;
     }

 }
