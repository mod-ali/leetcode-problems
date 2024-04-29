package org.integers;

public class CountSetBits {
    /* Function to get no of set
    bits in binary representation
    of positive integer n */
    static int countSetBits(int x, int y) {
        int count = 0;
        int n = x * y;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    // driver program
    public static void main(String args[]) {
        int i = 3, j = 3;
        System.out.println(countSetBits(i, j));
    }
}
