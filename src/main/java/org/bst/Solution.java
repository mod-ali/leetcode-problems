package org.bst;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public static void main(String[] args) {
        int i = singleNumber(new int[] { 1, 1, -2, -2 });
        System.out.println(i);
    }

    public static int singleNumberBF(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            boolean added = set.add(i);
            if (!added) {
                set.remove(i);
            }
        }
        return set.iterator().next();
    }

    public static int singleNumber(int[] nums) {
        int singleNum = 0;
        for (int i : nums) {
            singleNum = singleNum ^ i;
        }
        return singleNum;
    }

}
