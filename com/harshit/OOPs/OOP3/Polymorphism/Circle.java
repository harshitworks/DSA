package com.harshit.OOPs.OOP3.Polymorphism;

public class Circle extends Shapes{

    // this will be executed when an object of class circle is created and hence it will override the method of Shapes class
    @Override  // this is annotation
    void area() {
        System.out.println("the area is pie* r * r");
    }
}
