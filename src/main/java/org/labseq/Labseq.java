package org.labseq;

public class Labseq {
    /**
     * Computes the nth value of the labseq sequence using iteration
     * @param n the index of the value to be computed
     * @return the nth value of the labseq sequence
     */
    public static int compute(int n) {
        // base cases for n = 0, 1, 2, 3
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        }

        // initialize variables to store previous 4 terms of the sequence
        int lnMinusFour = 0;
        int lnMinusThree = 1;
        int lnMinusTwo = 0;
        int lnMinusOne = 1;
        int ln = 0;

        // loop to compute nth value as sum of (n - 4)th and (n - 3)th values
        for (int i = 4; i <= n; i++) {
            ln = lnMinusFour + lnMinusThree;
            lnMinusFour = lnMinusThree;
            lnMinusThree = lnMinusTwo;
            lnMinusTwo = lnMinusOne;
            lnMinusOne = ln;
        }

        return ln;
    }

    /**
     * Main method to print out the first `sequenceLength` values of the `labseq` sequence.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        final int sequenceLength = 20;
        for (int i = 0; i <= sequenceLength; i++) {
            System.out.println("l(" + i + ") = " + compute(i));
        }
    }
}