package org.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class CheckSum {

    public static void main(String[] args) {

        int[] sum = findSum(new int[] { 10, 3, 14, 5, 60, 7, 8 }, 20);
        int[] sumFaster = findSumFaster(new int[] { 15, 3, 14, 45, 60, 7, 8 }, 60);
        // 22
//        1, 5, 7, 8, 10, 12, 20, 60
        int[] sumElements = findSumElements(new int[] { 15, 3, 14, 45, 60, 7, 8 }, 60);
        System.out.println(Arrays.toString(sumElements));

    }

    public static int[] findSum(int[] arr, int n) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == n) {
                    return new int[] { i, j };
                }
            }
        }
        return arr;   // return the elements in the array whose sum is equal to the value passed as parameter
    }

    public static int[] findSumFaster(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer complementIndex = map.get(nums[i]);

            if (complementIndex != null) {
                return new int[] { complementIndex, i };
            }

            int complement = target - nums[i];
            map.put(complement, i);
        }

        return nums;
    }

    public static int[] findSumElements(int[] arr, int n) {

        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            // 15, 3, 14, 45, 60, 7, 8

            // 60 - 15 = 45 , 0

            Integer complementIndex = map.get(arr[i]);

            if (complementIndex != null) {
                result[0] = arr[complementIndex];
                result[1] = arr[i];
            }

            int complement = n - arr[i];
            map.put(complement, i);
        }

        return result;
    }

}
