package org.arrays;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] x = { 2,5,5,11 };

        int[] ints = twoSum(x, 10);
        Arrays.stream(ints).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}