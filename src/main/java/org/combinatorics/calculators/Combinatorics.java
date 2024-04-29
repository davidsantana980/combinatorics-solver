package org.combinatorics.calculators;

import java.math.BigInteger;

import static org.combinatorics.ICalculator.factorial;

public class Combinatorics {
    public static BigInteger get(Integer totalObjects, Integer choosing) {
        return (
                (
                    factorial(totalObjects))
                        .divide(
                                (
                                        factorial(totalObjects - choosing).multiply(factorial(choosing))
                                )
                        )
        );
    }
}
