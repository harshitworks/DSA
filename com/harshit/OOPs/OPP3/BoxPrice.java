package com.harshit.OOPs.OPP3;

public class BoxPrice extends BoxWeight{
    int price;
    public BoxPrice(int price){
        this.price = price;
    }
    public BoxPrice(int price, int weight){
        this.price = price ;
        super(weight);
    }
    public BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }
    public BoxPrice(int price, int length, int width, int height,int weight){
        this.price = price;
        super(weight,length,width,height);
    }
    public void display(){
        System.out.println("Here we are under BoxPrice and it is an child class of BoxWeight");
    }
}
