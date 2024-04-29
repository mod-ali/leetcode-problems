package org.arrays;

import java.util.*;

class MaxSubsequenceOfLengthK {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(maxSubsequence(new int[]{1, 25, 0, 15, 10, 5, 21}, 2)));
        System.out.println(Arrays.toString(maxSubsequenceUsingPQ(new int[]{1, 27, 21, 0, 15, 10, 5, 26}, 2)));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        if (nums.length == k) {
            return nums;
        }
        int n = nums.length;
        int[][] idxAndVal = new int[n][2];

        for (int i = 0; i < n; i++) {
            idxAndVal[i] = new int[]{i, nums[i]};
        }

        // sort by value in reverse order
        Arrays.sort(idxAndVal, Comparator.comparingInt(arr -> -arr[1]));

        int[][] maxK = Arrays.copyOf(idxAndVal, k);

        // sort by index
        Arrays.sort(idxAndVal, Comparator.comparingInt(arr -> -arr[0]));

        int[] seq = new int[k];

        for (int i = 0; i < k; i++) {
            seq[i] = maxK[i][1];
        }

        return seq;

    }

    public static int[] maxSubsequenceUsingPQ(int[] nums, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(n -> n[0]));
        for (int i = 0; i < nums.length; i++) {
            q.offer(new int[]{nums[i], i});
            if (q.size() > k)
                q.remove();
        }
        return q.stream()
                .sorted(Comparator.comparingInt(n -> n[1]))
                .mapToInt(n -> n[0])
                .toArray();
    }

}