package org.labseq;

import java.util.Hashtable;

public class Labseq {

    private static Hashtable<Integer, Integer> cachedValues = new Hashtable<>();

    /**
     * Computes the nth value of the labseq sequence using iteration
     * @param n the index of the value to be computed
     * @return the nth value of the labseq sequence
     */
    public static int compute(int n){

        switch (n){
            case 0, 2:
                return 0;

            case 1, 3:
                return 1;

            default:
                return compute(n-4) + compute(n-3);
        }
    }

    public static int cachedCompute(int n){

        switch (n){
            case 0, 2:
                return 0;

            case 1, 3:
                return 1;

            default:
                if (cachedValues.containsKey(n)){
                    return cachedValues.get(n);
                }
                if (!cachedValues.containsKey(n-4)){
                    cachedValues.put(n-4, compute(n-4));
                }
                if (!cachedValues.containsKey(n-3)){
                    cachedValues.put(n-3, compute(n-3));
                }
                return cachedValues.get(n-4) + cachedValues.get(n-3);
        }
    }

}