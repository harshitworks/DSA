package com.harshit.OOPs.OOP5.Interface;

public class AB implements B{
    @Override
    // the access modifier we are using should be greater than or equals to its previous version like in the parent interface/class
    public void funB() {
        System.out.println("This is function inside the interface B");
    }

    @Override
    public void funA() {
        System.out.println("This is a function inside the interface A ans as B extends the interface A so we have to implements all the preceding non defined methods");

    }
}
