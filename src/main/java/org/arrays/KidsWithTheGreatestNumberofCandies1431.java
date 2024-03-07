/* Max created on 1/22/2024 inside the package - org.integers */

package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberofCandies1431 {

    public static void main(String[] args) {
        List<Boolean> booleans = kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3);
        booleans.forEach(e -> System.out.println(e));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> booleans = new ArrayList<>();
        int max = candies[0];
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : candies) {
            if ((i + extraCandies) >= max) {
                booleans.add(true);
            } else {
                booleans.add(false);
            }
        }

        return booleans;

    }

}
