package com.harshit.Strings;

import org.w3c.dom.ls.LSOutput;

public class Comparison {

    static void main() {

// == : compares the values and the refernces of the objects
        String a = "Harshit";
        String b = "Harshit";
        System.out.println(a==b);  // gives true as they are pointing to the same object in the SCP memory
        // now lets create a new String object
        String c = new String("Harshit");   // create and store the string in the heap memory , therefore new object of the string is created.

        System.out.println(a==c);
        String d = new String("Harshit");  // again we create a new object.
        System.out.println(c==d);
        System.out.println(c.equals(d));

        System.out.println(new int[]{10,20,30});            // prints the value of the object no the actual array


    }
}