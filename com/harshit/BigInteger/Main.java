package com.harshit.BigInteger;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    static void main(String[] args) {
        BigInteger a = new BigInteger("456789345678");
        BigInteger b = new BigInteger("456798765");
        BigInteger c = BigInteger.TEN;
        BigInteger D = BigInteger.ZERO;

        BigInteger d = BigInteger.valueOf(5934579);



        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.remainder(b));
        System.out.println(a.divide(b));

        if(a.compareTo(b)<0) {
            System.out.println("a is smaller than b");
        }
        else {
            System.out.println("a is larger than b");
        }


        Factorial f = new Factorial();
        System.out.println(f.factorial(100));


        System.out.println("------------------------------------------------------------------------------");

/*        As float and decimal are floating point numbers so , they can store a limited range and and they store values in binary form that is fraction and exponent , so limits their precision



*/
        BigDecimal bg = new BigDecimal("0.001");
        BigDecimal bk = new BigDecimal("0.003");
        System.out.println(bk.subtract(bg));



    }
}
