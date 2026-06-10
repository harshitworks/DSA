package com.harshit.OOPs.OOP5.Abstract;

public abstract class Parent {
    int age;
    static String fatherName;

    public Parent(int age) {
        this.age = age;
        fatherName = "Papa ka Naam";
    }

    public void normal() {
        System.out.println("This is a normal method ");
        System.out.println("A abstract method can contains all types of methods");
    }
    public static void display() {
        System.out.println("This is a static method inside the abstract class, as staic methods cannot be inherited so cannot be overridden");
    }
    abstract void career(String msg) ;
    abstract void partner(String msg);
    abstract void askAge();
}
