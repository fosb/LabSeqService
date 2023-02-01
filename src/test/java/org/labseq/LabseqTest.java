package org.labseq;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.labseq.Labseq;

import java.math.BigInteger;

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


    @Test
    public void testCachedCompute() {
        // Test cases
        assertEquals(new BigInteger("0"), Labseq.cachedCompute(new BigInteger("0")));
        assertEquals(new BigInteger("1"), Labseq.cachedCompute(new BigInteger("1")));
        assertEquals(new BigInteger("0"), Labseq.cachedCompute(new BigInteger("2")));
        assertEquals(new BigInteger("1"), Labseq.cachedCompute(new BigInteger("3")));
        assertEquals(new BigInteger("1"), Labseq.cachedCompute(new BigInteger("4")));
        assertEquals(new BigInteger("1"), Labseq.cachedCompute(new BigInteger("5")));
        assertEquals(new BigInteger("1"), Labseq.cachedCompute(new BigInteger("6")));
        assertEquals(new BigInteger("2"), Labseq.cachedCompute(new BigInteger("7")));
        assertEquals(new BigInteger("2"), Labseq.cachedCompute(new BigInteger("8")));
        assertEquals(new BigInteger("2"), Labseq.cachedCompute(new BigInteger("9")));
        assertEquals(new BigInteger("3"), Labseq.cachedCompute(new BigInteger("10")));
        assertEquals(new BigInteger("4"), Labseq.cachedCompute(new BigInteger("11")));
        assertEquals(new BigInteger("4"), Labseq.cachedCompute(new BigInteger("12")));
        assertEquals(new BigInteger("5"), Labseq.cachedCompute(new BigInteger("13")));
    }


}