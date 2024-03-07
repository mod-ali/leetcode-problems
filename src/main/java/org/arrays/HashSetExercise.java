package org.arrays;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercise {
	public static void main(String args[]) {
		int[] data = {12, 34, 1, 56, 43, 34, 65};
		int duplicate = 0;
		Set<Integer> dataSet = new HashSet<>();

		for (int datum : data) {
			if (!dataSet.add(datum)) {
				duplicate = datum;
				break;
			}
		}

		System.out.println(duplicate);
	}
}