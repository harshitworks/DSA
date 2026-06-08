package com.harshit.OOPs.OPP3;

public class BoxWeight extends Box {
    int weight;


    public BoxWeight() {
        super(); // if we would not call this then it would automatically invoke the constructor having 0 arguments:
        this.weight = 0;
    }

    public BoxWeight(int weight) {
        this.weight = weight;
    }
    public BoxWeight (BoxWeight other) {
        super(other);
        this.weight= other.weight;

    }
    public BoxWeight(int l , int b, int h , int weight)  {
        super(l,b,h);
        this.weight = weight;

    }

//    public void display() {
//        System.out.println("this is under the child class");
//    }

}
