/* Max created on 1/18/2024 inside the package - org.strings */

package org.strings;

import java.util.Arrays;

public class ReverseWordsString151 {

    public static void main(String[] args) {
        String reversedString = reverseWords(" the sky  is blue  ");
        System.out.println(reversedString);
    }

    public static String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        // reverse the whole array
        int arrLength = charArray.length;
        reverseString(0, arrLength - 1, charArray);

        int l = 0;
        int r = 0;

        // reverse word by word
        while (r < s.length()) {
            while (l < arrLength && charArray[l] == ' ') {
                l++;
            }
            r = l;
            while (r < arrLength && charArray[r] != ' ') { // detect next space
                r++;
            }
            reverseString(l, r - 1, charArray);
            l = r;
        }
        // remove spaces
        return cleanSpaces(charArray);
    }

    private static String cleanSpaces(char[] charArray) {
        int left = 0;
        int right = 0;

        int arrLength = charArray.length;
        while (right < arrLength) {
            // move to the next letter
            while (right < arrLength && charArray[right] == ' ')
                right++;

            // swap left with right until right hits next space
            while (right < arrLength && charArray[right] != ' ') {
                charArray[left] = charArray[right];
                left++;
                right++;
            }
            // move right to next letter
            while (right < arrLength && charArray[right] == ' ')
                right++;

            // at this point, right points to the letter of next word
            if (right < arrLength) {
                charArray[left] = ' '; // add space between words
                left++;
            }
        }
        // return string from 0 to left -1
        return new String(charArray).substring(0, left);
    }

    private static void reverseString(int l, int r, char[] charArray) {
        while (l < r) {
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            l++;
            r--;
        }
    }
}
