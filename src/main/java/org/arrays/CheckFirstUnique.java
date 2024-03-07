package org.arrays;

class CheckFirstUnique {

    public static void main(String[] args) {
        int[] arr = { 4,4,4,3 };
        int firstUnique = findFirstUnique(arr);
        System.out.println(firstUnique);
    }

    public static int findFirstUnique(int[] arr) {
        boolean dublicate = false;
        for (int i = 0; i < arr.length; i++) {
            dublicate = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    dublicate = true;
                    break;
                }
            }
            if (!dublicate) {
                return arr[i];
            }
        }
        return -1;
    }
}