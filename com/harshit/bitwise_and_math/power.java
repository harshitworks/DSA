package com.harshit.bitwise_and_math;

public class power {

    static void main() {

        int power = 6 ;
        int base = 2 ;
        int ans = 1 ;
        while(power>0) {
            if((power & 1)==1) {
                ans = ans * base ;
            }
            base = base * base ;
            power = power >> 1 ;
        }
        System.out.println(ans);
    }
}
