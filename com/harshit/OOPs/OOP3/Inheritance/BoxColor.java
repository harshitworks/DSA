package com.harshit.OOPs.OOP3.Inheritance;

public class BoxColor extends BoxWeight{
    String color ;

    public BoxColor(String color) {
        this.color = color;
        System.out.println("This is the example of hierarchical inheritance");
    }

    public BoxColor(int l, int b, int h, int weight, String color) {
        super(l, b, h, weight);
        this.color = color;
    }
}
