package org.arrays;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetExercise {

    public static void main(String args[]) {

        int[] numbers = { 1, 4, 5, 2, 34, 66, 5, 4, 33, 45, 6, 8, 56, 76, 78, 98, 34, 37, 12, 12, 23, 43, 54, 56 };

        TreeSet<Integer> collect = new TreeSet<>(Arrays.stream(numbers).boxed().collect(Collectors.toSet()));
        System.out.println(collect.tailSet(50));

    }

}