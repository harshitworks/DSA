package com.harshit.OOPs.OPP3;

public class Box {
    int l ;
    int b ;
    int h ;


    public Box() {
        this.l = 0;
        this.b = 0;
        this.h = 0;
    }
    public  Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Box( Box other) {
        this.l = other.l;
        this.b = other.b;
        this.h = other.h;
    }
    public void display() {
        System.out.println("this is under the parent class");
    }
}
