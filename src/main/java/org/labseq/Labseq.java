package org.labseq;

import java.math.BigInteger;
import java.util.Hashtable;

public class Labseq {

    private static Hashtable<BigInteger, BigInteger> cachedValues = new Hashtable<>();

    /**
     * Computes the nth value of the labseq sequence using iteration
     * @param n the index of the value to be computed
     * @return the nth value of the labseq sequence
     */
    public static int compute(int n){

        switch (n){
            case 0:
                return 0;

            case 1:
                return 1;

            case 2:
                return 0;

            case 3:
                return 1;

            default:
                return compute(n-4) + compute(n-3);
        }
    }

    public static BigInteger cachedCompute(BigInteger n){

        if (n.compareTo(new BigInteger("0")) == 0 || n.compareTo(new BigInteger("2")) == 0){
            return new BigInteger("0");
        }
        if (n.compareTo(new BigInteger("1")) == 0 || n.compareTo(new BigInteger("3")) == 0){
            return new BigInteger("1");
        }

        if (cachedValues.containsKey(n)){
            return cachedValues.get(n);
        }
        BigInteger nMinus4 = n.subtract(new BigInteger("4"));
        if (!cachedValues.containsKey(nMinus4)){
            cachedValues.put(nMinus4, cachedCompute(nMinus4));
        }
        BigInteger nMinus3 = n.subtract(new BigInteger("3"));
        if (!cachedValues.containsKey(nMinus3)){
            cachedValues.put(nMinus3, cachedCompute(nMinus3));
        }
        return cachedValues.get(nMinus4).add(cachedValues.get(nMinus3));
    }

}