package com.harshit.recursion_level_1;

public class factorial_and_sum {
    static void main() {
        System.out.println(fact(10));
        System.out.println(sum_of_digits(1324));

    }
static double fact(int n) {
        if(n==0) return 1 ;
        return n*fact(n-1);
}


static int sum_of_digits(int n  )
{
    if(n==0) return 0 ;
    return n%10 + sum_of_digits(n/10);
}

}

