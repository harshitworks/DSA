package com.harshit.OOPs.OPP3.Encapsulation;

public class A {
    int size ;
    String name ;
    int[] arr;

    public A(int size, String name) {
        this.size = size ;
        this.name = name ;
        arr = new int[size];
    }
    public void display() {
        System.out.println();
    }

}
