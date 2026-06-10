package com.harshit.OOPs.OOP3_2.Polymorphism;

public class Circle extends Shape{
    int radius;
    void display() {
        System.out.println("I am a Circle");
    }
    // here we are trying to override the final method which will cause an error:
//    void display(String s ) {
//        System.out.println("This method ");
//    }

//@Override : gives an error as: Static methods can be inherited but cannot be overridden
   static void fun() {
       System.out.println("we are under circle class and trying to override a static method");
    }
}
