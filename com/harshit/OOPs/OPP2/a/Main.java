package com.harshit.OOPs.OPP2.a;

import org.w3c.dom.ls.LSOutput;

import static com.harshit.OOPs.OPP2.b.Message.message;


public class Main {
    static void main(String[] args) {
        message();           // here we are using the method message which is written inside another package

        // we donot need to import classes or methods if they are in same package
        Human kunal = new Human(25, "Kunal Kushwaha", 45, true);
        Human harshit = new Human(20, "Harshit Gaur", 42, false);
        System.out.println(harshit.age);
        System.out.println(kunal.salary);


        System.out.println(harshit.pop);
        Human harshit2 = new Human(20, "Harshit Gaur", 42, false);
        System.out.println(Human.pop);  // this is the correct method to use the static varible as it is independent of object so use it with class name


//     fun();      // this will raise an error as we are trying to acees object dep function with obj indep function

        Main obj = new Main();
        obj.fun2();

    }

    void fun2() {
     System.out.println("this is also a non static method and require object but it allows non static methods inside it , as object is required to call this function is used to call the function inside it ");
        fun();
        fun3();             // calling a static fun inside a non static

    }

    void fun() {
        System.out.println("this is a non static that is object dependent function");

    }
    static void fun3() {
        System.out.println("this is a static method that is no need of object for calling it ");
    }

}


