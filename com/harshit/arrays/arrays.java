package com.harshit.arrays;

import org.w3c.dom.ls.LSOutput;

public class arrays
{
    // arrays are the collection of similar data types values .
    // syntax: datatype[] variable_name = new datatype[size];
    // new is keyword that is used to create a object in the memory

    int[] a = new int[3];

    // or directly

    static int[] b = {1,23,45,90};  // if we want to access the array b , inside a object independent function that is "main" then we have to make the array object independent that is static.


// arrays objects are stored in heap in java
// heap objects are not continuous...hence arrays may not be continuous


    static void main(String[] args) {
        System.out.println(b[2]);


String[] ar = new String[10];
        System.out.println(ar[3]);  // returns null as , nothing is given to print. so null is a literal

        String gh = null;
//        int fg = null;  // gives an error--> null can only be assigned to non-primitive datatype
        System.out.println(gh);

    }


}
