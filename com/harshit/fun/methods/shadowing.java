package com.harshit.fun.methods;

public class shadowing {
    static int x= 34;              // we are using static here, because we cannot use a dependent variable inside a independent function. independent of what..? object

    static void main() {
        System.out.println(x);          // returns 34
        int x = 50;                      // here this value of x will overlap the older value of x why is it so, .
       // scope of the variable begins where the value initialised .
        System.out.println(x);
        main2();

    }

    static void main2() {
        System.out.println(x);      // returns original value that is 34. as it uses the global value declared
    }


}
