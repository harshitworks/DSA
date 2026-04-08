package com.harshit.bitwise_and_math;

public class odd_even {

    static void main() {
        int a = 53;
        System.out.println(even(a));
    }

    static boolean even(int a ) {
        return ((a & 1)!=1);          // here we checking the last sigificant digit of the number if is 1 then it is a odd number.
    }
}
