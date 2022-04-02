package algorithms;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.valueOf(number);

        if (result.equals(BigInteger.ONE)) return result;
        else {
            return (result.multiply(factorial(result.intValue() - 1)));
        }
    }


    public static void main(String[] args) {
        System.out.println(factorial(9));
    }
}
