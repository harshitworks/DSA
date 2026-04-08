package com.harshit.recursion_level_1;

public class count_no_zeroes {
    static void main() {
        int n = 440540;
        System.out.println(count(n,0));
        System.out.println(helper(n));
    }

    static int helper(int n )         // this is called helper function as we donot want to give count = 0 in the first case, but it is required by our function con , thereofore we made a another function we takes only one argument and call con function with two argument , by giving the count value = 0 , automatically
    {
        return count(n, 0);
    }
  //  special pattern , how to pass a value in the above calls, here c is return only once
    static int count(int n , int c) {
        if(n%10==n) return c ;
        if(n%10==0) return count(n/10, c+1 );
        else return count(n/10 , c);
    }
}
