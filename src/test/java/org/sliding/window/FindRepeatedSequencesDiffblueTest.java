package org.sliding.window;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class FindRepeatedSequencesDiffblueTest {

    /**
     * Method under test: {@link FindRepeatedSequences#findRepeatedSequences(String, int)}
     */
    @Test
    void testFindRepeatedSequences() {
        String expected = "GGGGGGGGG";
        Set<String> actualFindRepeatedSequencesResult = FindRepeatedSequences.findRepeatedSequences("GGGGGGGGGGGGGGGGGGGGGGGGG", 9);
        System.out.println("size = " + actualFindRepeatedSequencesResult.size());
        assertTrue(actualFindRepeatedSequencesResult.contains(expected));
    }

    @Test
    void testFindRepeatedSequences2() {
        String expected = "AAAAACCC";
        Set<String> actualFindRepeatedSequencesResult = FindRepeatedSequences.findRepeatedSequences("AAAAACCCCCAAAAACCCCCC", 8);
        assertTrue(actualFindRepeatedSequencesResult.contains(expected));
    }

    @Test
    void testFindRepeatedSequences3() {
        String expected = "TTTTTCCCCC";
        Set<String> actualFindRepeatedSequencesResult = FindRepeatedSequences.findRepeatedSequences("TTTTTCCCCCCCTTTTTTCCCCCCCTTTTTTT", 10);
        assertEquals(9, actualFindRepeatedSequencesResult.size());
        assertTrue(actualFindRepeatedSequencesResult.contains(expected));
    }

    @Test
    void testFindRepeatedSequences4() {
        String expected = "AAAAACCC";
        Set<String> actualFindRepeatedSequencesResult = FindRepeatedSequences.findRepeatedSequences("AAAAACCCCCAAAAACCCCCC", 8);
        assertTrue(actualFindRepeatedSequencesResult.contains(expected));
    }

}

