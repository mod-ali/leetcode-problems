/* Max created on 1/22/2024 inside the package - org.strings */

package org.strings;

public class IncreasingTripletSubsequence334 {

    public static void main(String[] args) {
        boolean result = increasingTriplet(new int[] { 20, 100, 10, 12, 5, 13 });
        System.out.println(result);
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }

        return false;
    }

}
