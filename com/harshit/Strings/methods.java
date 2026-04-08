package com.harshit.Strings;

import java.util.Arrays;

public class methods {

    static void main() {
        String name = "   Harshit Gaur     ";
        System.out.println(name.toCharArray());
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));  //  make the array of characters , here this toString is a method of Arrays
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("r"));
        System.out.println(name.charAt(4));
        System.out.println(name.split(" "));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.strip());




    }
}
