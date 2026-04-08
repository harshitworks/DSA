package com.harshit.recursion_level_1;

public class reversing_the_number {
    static void main() {
        int n = 1239321;
          // we can coun the digits by using the log also
        System.out.println(reverse(n));
        System.out.println(palim(n));

    }


    static boolean palim(int n ) {
        if(n==reverse(n)) return true;
        return false ;
    }



    static int reverse(int n ) {
        int count = 0;
        int m = n ;
        while (m != 0) {
            m /= 10;
            count++;
        }

        if(n%10==n) return n ;
        return (n%10)* (int)(Math.pow(10, count-1))  + reverse(n/10 );
    }


}
