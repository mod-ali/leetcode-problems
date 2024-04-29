package org.arrays;

public class MaximumProductOfTwoElements {

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3, 4, 5, 2}));
        System.out.println(maxProduct(new int[]{1, 5, 4, 5}));
        System.out.println(maxProduct(new int[]{3 , 7}));
    }

    public static int maxProduct(int[] nums) {
        if (nums.length == 2) {
            return (nums[1] - 1) * (nums[0] - 1);
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num >= max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }

        return (max - 1) * (secondMax - 1);
    }


}
