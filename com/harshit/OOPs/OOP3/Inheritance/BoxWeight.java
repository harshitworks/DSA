package com.harshit.OOPs.OOP3.Inheritance;

public class BoxWeight extends Box{
    int weight ;

    public BoxWeight() {
        this.weight= 60 ;
    }

    public BoxWeight(int l, int b, int h, int weight) {
        super(l, b, h);  // this is used to initialise the values from the parent class
        this.weight = weight;
       super.l=10000;
    }

    public BoxWeight(BoxPrice other) {
    }

//    @Override
    static void greeting() {
        System.out.println("This is a static method inside the BoxWeight");
    }
}
