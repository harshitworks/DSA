package com.harshit.fun.methods;

import java.util.Arrays;

public class VarArgs {

    static void main(String[] args) {
        // these are the functions which take variable or unknown number of arguments.
        // we can give unknown number of arguments to a function by: (int...a) it will make an array of integers or (String...c) it will make an array of Strings

      int[] t = {10,20,30};
        System.out.println(Arrays.toString(t)); // this is the way to print the given array.

      fun2(12,24,36,48,60,72);           // here we called the function 'fun2' with variable number of arguments .


        // here we are calling the function 'fun3' with 2 int arguments and unknown number of string arguments.
      fun3(80,90,"harshit","gaur","takes a short leave on ","friday");
    }



    static void fun2(int...c)   // function taking variable number of arguments
    {
        System.out.println(Arrays.toString(c));
    }


    // let's take mixed type of arguments with variable numbers of arguments
    static void fun3(int a, int b, String... f)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(f));


    }

//1.12
}
