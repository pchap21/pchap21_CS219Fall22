package HW9;

import java.math.BigInteger;
import java.util.Objects;

public class HW9 {
    /*

        (i.e., a loop). Do not use BigInteger's built in pow function.
        Use the function pow we wrote in Chap9ImmutableObjects.BigIntegerPlay
        as a guide.
     */
    public static BigInteger bigpow(BigInteger x, int y) {
        BigInteger prod = BigInteger.ONE;
        for (int i = 0; i < y; i ++) {
            prod = prod.multiply(x);
        }

        return prod;
    }

    /*
        Compute x raised to the y power using the recursive definition
        from the programming assignment in Canvas. Do not use BigInteger's
        built in pow function.
     */
    public static BigInteger fastbigpow(BigInteger x, int y) {
        if (y == 0)
            return BigInteger.ONE;
        if (y % 2 == 1)
            return x.multiply(fastbigpow(x, y - 1));
        if (y % 2 == 0)
            return fastbigpow(x, y / 2).multiply(fastbigpow(x, y / 2));
        return x;
    }

    public static void main(String[] args) {

        BigInteger x = new BigInteger("1029883673");

        // Test bigpow
        BigInteger xtoy = bigpow(x,10);
        System.out.println(xtoy.toString().equals("1342399346995612672464070989837373830965198185983932347990254056431651542191037112352025649"));

        // make sure our result agrees with BigInteger's built in pow function.
        System.out.println(bigpow(xtoy, 100).equals(xtoy.pow(100)));

        // Test fastbigpow
        xtoy = fastbigpow(x,10);
        System.out.println(xtoy.toString().equals("1342399346995612672464070989837373830965198185983932347990254056431651542191037112352025649"));

        // make sure our result agrees with BigInteger's built in pow function.
        System.out.println(fastbigpow(xtoy, 100).equals(xtoy.pow(100)));
    }
}
