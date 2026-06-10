package com.harshit.OOPs.OOP3_2;

public class BoxHeight extends Box {
    int height ;

    public BoxHeight() {
        this.height = -1 ;
    }
    public BoxHeight(int height) {
        this.height = height ;
    }
    public BoxHeight(int l , int b  , int h , int height) {
        super(l,b,h);
        this.height = height ;
    }
    public void display() {
        System.out.println("Here we are under BoxHeight and it is an child class of Box");
    }

}
