package algorithms;

import java.math.BigInteger;

public class FlipBit {

    public static int flipBit(int value, int bitIndex) {
        BigInteger result = BigInteger.valueOf(value);
        return result.flipBit(bitIndex).intValue();
    }


    public static void main(String[] args) {
        System.out.println(flipBit(0, 1));
    }
}
