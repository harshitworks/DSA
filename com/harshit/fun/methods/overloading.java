package com.harshit.fun.methods;

import java.util.Arrays;

public class overloading {
    // Function Overloading allows to declare two or more functions with same name , but the condition is , they must take different arguments or taking different number of arguments.

    static void main(String[] args) {

        fun(2);             // as there is one argument given , it will call the function which has a name "fun" and takes one argument.
        fun(23,34);       // calls the function having name "fun" and takes two arguments

        fun("here i am giving a string as a argument ");

        fun(12,23,32,23,34,45);   // here the complier search for the function named as "fun" and takes given number of arguments

        fun("hey ", "there ", "I", "am ", "using","function overloading");
    }


    static void fun(int a )
    {
        System.out.println(a);
    }

    static void fun(int a , int b)
    {
    System.out.println(a+b);
    }

    static void fun(String c)
    {
        System.out.println(c);
    }

    static void fun(int...a)
    {
        System.out.println(Arrays.toString(a));
    }
    static void fun(String... n)
    {
        System.out.println(Arrays.toString(n));
    }

}
