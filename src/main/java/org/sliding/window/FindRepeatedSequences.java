package org.sliding.window;

import java.util.*;

public class FindRepeatedSequences {

    public static Set<String> findRepeatedSequences(String s, int k) {

        // Replace this placeholder return statement with your code

        if (s.length() < k) {
            return Collections.emptySet();
        }

        Set<String> stringSet = new HashSet<>();
        Set<String> repeatedSequence = new HashSet<>();

        int startPointer = 0;
        int endPointer = k;

        while (endPointer <= s.length()) {
            String substring = s.substring(startPointer, endPointer);
            System.out.println(substring);
            boolean isAdded = stringSet.add(substring);
            if (!isAdded) {
                repeatedSequence.add(substring);
            }
            startPointer++;
            endPointer++;
        }

        return repeatedSequence;
    }
}