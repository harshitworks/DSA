package com.harshit.fun.methods;

import java.util.Scanner;

public class prime {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);
        System.out.println(isarmstrong(n));

        // printing all the three digits Armstrong number:
        for(int i =100;i<1000;i++) {
            if(isarmstrong(i))
            {
                System.out.print(i+" ");
            }
        }

    }

    static boolean isprime(int n ) {

        if(n<=1)
        {
            return false;
        }
        int c =2;
        while(c*c <= n)
        {
            if(n%c==0)
            {
                return false;
            }
        c++;
        }
        return c*c > n;


            }


    static boolean isarmstrong(int n) {
        int original = n;
        int sum=0;
        while (n>0) {
            int rem = n%10;
            sum += rem*rem*rem;
            n =n/10;

        }
        return sum == original;   // if equals return true otherwise false
    }


}
