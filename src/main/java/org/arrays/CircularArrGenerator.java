/* Max created on 3/6/2024 inside the package - org.zalando */

package org.arrays;

public class CircularArrGenerator {

    public static void generateCircularArrFromChars(char[] a,
                                                    int end) {
        int endIndex = a.length + end;

        for (int i = end; i < endIndex; i++) {
            System.out.print(a[(i % a.length)] + " ");
        }
    }

    public static void generateCircularArrFromInts(int[] a,
                                                   int end) {
        for (int i = end; i < a.length + end - 1; i++) {
            System.out.println(a[i % a.length]);
        }
    }

    public static void main(String args[]) {
        char[] a = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};
        generateCircularArrFromChars(a, 4);
        System.out.println();
        generateCircularArrFromChars(a, 3);
    }
}
