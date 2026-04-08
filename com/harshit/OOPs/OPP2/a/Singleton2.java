package com.harshit.OOPs.OPP2.a;

public class Singleton2 {

    static void main(String[] args) {
        Singleton ob1 = Singleton.fun();
        Singleton ob2 = Singleton.fun();
        Singleton ob3 = Singleton.fun();

        // all three objects are pointing to same object

    }
}
