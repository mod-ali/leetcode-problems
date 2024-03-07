//package org.sliding.window;
//
//import java.util.*;
//
//import static java.awt.SystemColor.window;
//
//// https://leetcode.com/problems/sliding-window-maximum/
//class SlidingWindowMaximum {
//
//    public static void main(String[] args) {
//        int maxSlidingArray = findMaxSumArrayOfSizeK(new int[] { 1,3,-1,-3,5,3,6,7 }, 4);
//        int[] maxWindow = maxSlidingWindow(new int[] { 1,3,-1,-3,5,3,6,7 }, 4);
//
//        System.out.println(Arrays.toString(maxWindow));
//    }
//
//    public static int[] findMaxSlidingWindowBF(int[] nums, int k) {
//        int iterations = nums.length - k + 1;
//        int[] maxNums = new int[iterations];
//
//        for (int i = 0; i < iterations; i++) {
//            int endPointer = i + k;
//            int[] window = Arrays.copyOfRange(nums, i, endPointer);
//            maxNums[i] = Arrays.stream(window).max().getAsInt();
//        }
//
//        return maxNums;
//    }
//
//    public static int findMaxSumArrayOfSizeK(int[] nums, int k) {
//        int windowSum = 0, maxSum = 0;
//
//        for (int i = 0; i < k; i++) {
//            windowSum += nums[i];
//        }
//
//        for (int end = k; end < nums.length; end++) {
//
//            int diff = end - k;
//            windowSum += nums[end] - nums[diff];
//            maxSum = Math.max(maxSum, windowSum);
//        }
//
//        return maxSum;
//    }
//
//    public static int[] maxSlidingWindow(int[] nums, int k) {
//        int maxNum = 0;
//
//        for (int i = 0; i < k; i++) {
//            if(nums[i] > maxNum) {
//                maxNum = nums[i];
//            }
//        }
//
//        for (int end = k; end < nums.length; end++) {
////            1,-1,3,-3,5,3,6,7
//            int diff = end - k;
//            windowSum += nums[end] - nums[diff];
//            if(windowSum > maxSum) {
//                maxSum = windowSum;
//                startIndex = diff + 1;
//            }
//        }
//        System.out.println(startIndex);
//        return Arrays.copyOfRange(nums, startIndex, startIndex + k);
//    }
//}