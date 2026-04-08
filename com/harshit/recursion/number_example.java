package com.harshit.recursion;

public class number_example {
    static void main() {
        print(1);
    }
    static void print(int n ) {

        if(n==5) return ;             //  this is known as base condition
        System.out.println(n);
        print(n+1);// this is known as recursive call
    }





}
