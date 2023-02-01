package org.labseq;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.labseq.Labseq;

public class LabseqTest {
    @Test
    public void testCompute() {
        // Test cases
        assertEquals(0, Labseq.compute(0));
        assertEquals(1, Labseq.compute(1));
        assertEquals(0, Labseq.compute(2));
        assertEquals(1, Labseq.compute(3));
        assertEquals(1, Labseq.compute(4));
        assertEquals(1, Labseq.compute(5));
        assertEquals(1, Labseq.compute(6));
        assertEquals(2, Labseq.compute(7));
        assertEquals(2, Labseq.compute(8));
        assertEquals(2, Labseq.compute(9));
        assertEquals(3, Labseq.compute(10));
        assertEquals(4, Labseq.compute(11));
        assertEquals(4, Labseq.compute(12));
        assertEquals(5, Labseq.compute(13));
    }

    /*
    @Test
    public void testCachedCompute() {
        // Test cases
        assertEquals(0, Labseq.cachedCompute(0));
        assertEquals(1, Labseq.cachedCompute(1));
        assertEquals(0, Labseq.cachedCompute(2));
        assertEquals(1, Labseq.cachedCompute(3));
        assertEquals(1, Labseq.cachedCompute(4));
        assertEquals(1, Labseq.cachedCompute(5));
        assertEquals(1, Labseq.cachedCompute(6));
        assertEquals(2, Labseq.cachedCompute(7));
        assertEquals(2, Labseq.cachedCompute(8));
        assertEquals(2, Labseq.cachedCompute(9));
        assertEquals(3, Labseq.cachedCompute(10));
        assertEquals(4, Labseq.cachedCompute(11));
        assertEquals(4, Labseq.cachedCompute(12));
        assertEquals(5, Labseq.cachedCompute(13));
    }
     */

}