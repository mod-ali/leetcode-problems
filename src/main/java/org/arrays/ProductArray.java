package org.arrays;

class ProductArray {

    public static int[] findProduct(int[] arr) {
        int n = arr.length;
        int i;
        int prefix = 1;

        // Allocation of result array
        int[] result = new int[n];

        // Product of elements on left side excluding arr[i]
        for (i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }

        // Initializing postfix to 1 for product on right side
        int postfix = 1;

        // Product of elements on right side excluding arr[i]
        for (i = n - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= arr[i];
        }

        return result;
    }

    public static String arrayToString(int[] arr) {
        if (arr.length > 0) {
            StringBuilder result = new StringBuilder();
            for (int j : arr) {
                result.append(j);
                result.append(" ");
            }
            return result.toString();
        } else {
            return "Empty Array!";
        }
    }

    public static void main(String args[]) {

        int[] arr = { 2,3, 4, 5 };

        System.out.println("Array before product: " + arrayToString(arr));

        int[] prodArray = findProduct(arr);

        System.out.println("Array after product: " + arrayToString(prodArray));
    }

}
