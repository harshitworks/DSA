package com.harshit.bitwise_and_math;

public class xor {
    static void main() {
        int n = 6 ;
        int ans = xor_from_0_to_n(n);
        System.out.println(ans);
        System.out.println(xor_in_range(4,34));



    }

    static int xor_from_0_to_n(int n )
    {
        if(n%4==0) return n ;
        if(n%4==1) return 1 ;
        if(n%4==2) return n+1 ;
        return 0 ;

    }


    static int xor_in_range(int a , int b ) {
        int ans1 = xor_from_0_to_n(b);
        int ans2 = xor_from_0_to_n(a-1);
        return ans1 ^ ans2 ;
    }

}
