/* Max created on 1/18/2024 inside the package - org.strings */

package org.strings;

/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
* */
public class MergeStringslternately1768 {

    public static void main(String[] args) {
        String mergeString = mergeAlternately("hi", "bye123");
        System.out.println(mergeString);
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                stringBuilder.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                stringBuilder.append(word2.charAt(i));
            }
            i++;
        }

        return stringBuilder.toString();
    }
}
