package com.harshit.maths;

public class gcd_and_lcm {
    static void main() {
        System.out.println(gcd(12,2));
        System.out.println(lcm(12, 40));

    }

    static int gcd(int a , int b ) {
        int rem = b% a ;
        if(rem==0) return a ;
        return gcd(rem,a);
    }
    static int lcm(int a , int b ) {
        return a*b/gcd(a,b);
    }
}
