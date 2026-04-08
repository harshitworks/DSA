package com.harshit.OOPs.OOP3.Inheritance;

public class Box {
    int l ;
    int b ;
    int h ;


    Box () {                                    // this will be used when ther is no parameter given
        this.l= -1 ;
        this.b= -1 ;
        this.h= -1 ;
    }

    Box (int side) {                          // used when there is single parameter given
        this.l= side;
        this.b =side;
        this.h=side;
    }
     Box(int l, int b, int h) {                    // when there are three parameters given
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box (Box old ) {                         //used when an object is given as a parameter to initialise another object
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    public void display() {
        System.out.println("the length is "+this.l+" and breadth is "+this.b+" and height "+this.h);
    }

    static void greeting() {
        System.out.println("This is a static method inside the Box Class ");
    }
}
