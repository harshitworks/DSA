package com.harshit.OOPs.OPP4.Interface;

public interface A {
    public void funA();

    static void display() {
        System.out.println("Static methods cannot be inherited so cannot be overridden therefore should have their definition in the interfaces only i.e. body in interface");
    }
}
