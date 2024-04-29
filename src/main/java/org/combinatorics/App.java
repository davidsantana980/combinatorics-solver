package org.combinatorics;

import org.combinatorics.calculators.Combinatorics;
import org.combinatorics.calculators.Permutation;

import java.math.BigInteger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        BigInteger bigInteger = Combinatorics.get(12, 2);
        BigInteger integer = Permutation.get(12, 2);

        System.out.println(bigInteger);
        System.out.println(integer);
    }
}
