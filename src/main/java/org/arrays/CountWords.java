/* Max created on 3/5/2024 inside the package - org.arrays */

package org.arrays;

public class CountWords {

public static boolean shouldSkip = true;

    static int countWords(String str) {

        int wordCount = 0;

        int i = 0;
        while (i < str.length()) {

            char c = str.charAt(i);
            if (c == ' ' || c == '!' || c == '?' || c == '.') {
                shouldSkip = true;
            } else if(shouldSkip) {
                shouldSkip = false;
                wordCount++;
            }
            ++i;
        }
        return wordCount;
    }


    public static void main(String[] args) {

        String str = "One two       three\n four five sara ? ggg.  ";

        System.out.println("" + countWords(str));

    }
}
