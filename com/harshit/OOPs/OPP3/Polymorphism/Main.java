package com.harshit.OOPs.OPP3.Polymorphism;

public class Main {
    static void main(String[] args) {
        Shape sh = new Shape();
        sh.display();
        Circle c = new Circle();
        c.display();
        Rectangle r = new Rectangle();
        r.display();
        Shape s = new Circle();
        s.display();
        c.display("Method overriding ");
        // here as s is have a reference type of Shape and object type of circle and what normally happens it will check the accessibility and modifiers according to reference type and execute according to object tpe, but static methods are not associated with objects and hence cannot be overridden
        s.fun();  // it will execute the reference type method
    }
}
