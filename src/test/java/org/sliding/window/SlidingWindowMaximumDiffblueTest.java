package org.sliding.window;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SlidingWindowMaximumDiffblueTest {

    /**
     * Method under test: {@link SlidingWindowMaximum#findMaxSumSlidingWindow(int[], int)}
     */
    @Test
    void testFindMaxSlidingWindow() {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10},
                SlidingWindowMaximum.findMaxSumSlidingWindow(new int[] { 1,3,-1,-3,5,3,6,7 }, 3));
        assertThrows(NegativeArraySizeException.class,
                () -> SlidingWindowMaximum.findMaxSumSlidingWindow(new int[] { 1, -1, 1, -1 }, 6));
    }
}

