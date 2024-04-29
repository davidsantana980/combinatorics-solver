package org.combinatorics;

import java.math.BigInteger;

public interface ICalculator {
    static BigInteger factorial(Integer value){
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    };
}
