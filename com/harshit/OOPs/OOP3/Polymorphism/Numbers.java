package com.harshit.OOPs.OOP3.Polymorphism;

public class Numbers {


    double add(double a , int b) {
        System.out.println("this will be called when two arguments are given");
        return a+b;
    }
    int add(int a, int b, int c ) {
        System.out.println("this will be called when three arguments are given ");
        return a+b+c;

    }

    static void main(String[] args) {
        Numbers obj = new Numbers();

        System.out.println(obj.add(4,5,6));
        System.out.println(obj.add(4.6,5));
    }
}
