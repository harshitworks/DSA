package com.harshit.OOPs.OOP3_2.Polymorphism;

public class Shape {
    int x ;
     void display() {
         System.out.println("I am a General Shape");
     }
     final void display(String st) {
         System.out.println("This is a method,defined with final and cannot be overridden "+st);
     }
     // Final keyword is used to restrict the inheritance of a class and overridden of a method:
    // if we declared our class as final then implicitly all the methods of the class declared as final,

    static void fun() {
        System.out.println("I am under the Shape and a static method so , it will execute the same fun irrespective ");
    }
}
