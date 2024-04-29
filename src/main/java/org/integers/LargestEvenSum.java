package org.integers;

import java.util.Arrays;

class LargestEvenSum {
    public static void main(String[] args) {
        System.out.println(largestEvenSum(new int[]{4, 1, 5, 3, 1}, 3));
    }

    public static long largestEvenSum(int[] nums, int k) {
        Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;
        for (int i = 0; i < k; ++i) {
            ans += nums[n - i - 1];
        }
        if (ans % 2 == 0) {
            return ans;
        }
        final int inf = 1 << 29;
        int mx1 = -inf, mx2 = -inf;
        for (int i = 0; i < n - k; ++i) {
            if (nums[i] % 2 == 1) {
                mx1 = nums[i];
            } else {
                mx2 = nums[i];
            }
        }
        int mi1 = inf, mi2 = inf;
        for (int i = n - 1; i >= n - k; --i) {
            if (nums[i] % 2 == 1) {
                mi2 = nums[i];
            } else {
                mi1 = nums[i];
            }
        }
        ans = Math.max(-1, Math.max(ans - mi1 + mx1, ans - mi2 + mx2));
        return ans % 2 != 0 ? -1 : ans;
    }
}