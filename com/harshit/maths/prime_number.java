package com.harshit.maths;

public class prime_number {
    static void main() {
        System.out.println(prime(65));

        // printing prime numbers within a range
        int n = 500;
        for (int i = 0; i <=n; i++) {
//      System.out.println(i+" is Prime "+prime(i));
        if(prime(i)) System.out.println(i);

        }

        // but this method is not efficient and optimal as , to check whether number is prime or not it takes sqrt(n) and we are doing this for n numbers so it will end to 0(n*n^0.5) we can do it in more optimal way

    }

    static boolean prime(int n ) {
        if(n<=1) return false;
        int c= 2 ;
         while(c*c<=n) {          // we donot need to check for all the numbers as the factors starts repeating after a time:
             if(n%c==0) return false;
             c++;
         }
         return true;
    }



}
