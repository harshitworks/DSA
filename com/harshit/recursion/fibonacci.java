package com.harshit.recursion;

public class fibonacci {
    static void main() {
//        System.out.println(fib(7));
//
//        // to print the series of the Fibonacci series:
//        int k = 10 ;
//        for (int i = 1; i < k; i++) {
//            System.out.print(fib(i)+" ");
//
//        }



        System.out.println(fib_formula(7));
    }


    // nth fibonacci term.
    static int fib(int n ) {
        if(n==1) return 0 ;
        if(n==2) return 1 ;

        return (fib(n-1) + fib(n-2));


    }

       // fibonacci nth term using the formula
      static int fib_formula(int n ) {
        return (int)((Math.pow(((1 +  Math.sqrt(5))/2) , n ))/Math.sqrt(5));
      }

}
