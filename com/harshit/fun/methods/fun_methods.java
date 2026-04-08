package com.harshit.fun.methods;



import java.util.Arrays;
import java.util.Scanner;

public class fun_methods {
    public static void main() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
//        sum();
//        greet();
//        System.out.println("Enter your good name ");

//        String call= greet2( name);           // as the function is returning a value not printing it directly, we need to store it in a variable and then print it , or can directly print indside sout
//
//        System.out.println(call);



        System.out.println(name);
        int[] a= { 1,2,3};
        change(a);
        System.out.println(a[0]);
        System.out.println(Arrays.toString(a));





        // use of Block
        int s= 12;

        {
            s =1; // we cannot initialise(int s = 1 ) the same variable which is already initialised, but we can chane or modify it.
            System.out.println(s);


            int z = 67;
            System.out.println(z);
        }

//        System.out.println(z);   --> gives an error , anything that is initialised inside a block , can only be used inside the block.


    }


    public static void sum() {
        Scanner input = new Scanner(System.in);
        int num1, num2, ans;
        System.out.print("Enter you number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter you number 2: ");
        num2 = input.nextInt();
        ans = num1 + num2;
        System.out.println("The answer is: " + ans);


    }

    public static void greet() {
        System.out.println("Hey user, whats going there.");
    }


    public static String greet2(String name)
    {
        return "Hey "+name;

    }



// So In java we donot have pointers and call by reference , but still there are methods to change the original value lets see how it works.

    static void nochange(String name)
    {
        name= "here the value does not change as it is call by value , for primitive datatypes(int, short , char, String) the original value remains same.. ";
    }

// the original value changes in derived data types (array , linked list) , here also we pass the arguments by call by value ...but the changes made in called value get reflected in original value.

    static void change(int[] arr)
    {
        arr[0]=23;
    }


// 55 min.


}