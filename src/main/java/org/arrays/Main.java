package org.arrays;

public class Main {

    public static void main(String[] args) {
        boolean result = isPalindrome("DCBAABCD");
        boolean result2 = isPalindrome("BACAB");

        System.out.println(result);
        System.out.println(result2);
    }

    public static boolean isPalindrome(String s) {
        char[] s2 = s.toCharArray();
        double remainder = s2.length % 2;
        char a;
        char b;
        int stringMiddleIndex = s2.length / 2;
        if(remainder == 0) { // even
            a = s2[stringMiddleIndex - 1];
            b = s2[stringMiddleIndex];
        } else { // odd
            a = s2[stringMiddleIndex -1];
            b = s2[stringMiddleIndex + 1];
        }
        System.out.println(a + " " + b);
        for (int i = 2; i < s2.length /2; ) {
            if (a != b) {
                return false;
            }
            a = s2[stringMiddleIndex - i];
            b = s2[stringMiddleIndex + (i-1)];
        }
        return true;
    }
}