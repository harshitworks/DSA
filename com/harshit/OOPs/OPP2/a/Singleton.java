package com.harshit.OOPs.OPP2.a;

public class Singleton {
    // Singleton is a class which allows only a single object only


    private Singleton() {       // here we are making the constructor private so that it cannnot be accessed from outside

    }
    private static Singleton object1 ;

    public static Singleton fun() {
        if(object1==null ) {    // if the object is not exist then it will create it
            object1 = new Singleton();
        }
        return object1;
    }


}
