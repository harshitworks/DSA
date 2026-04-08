package com.harshit.OOPs.OOP3.Inheritance;

public class BoxPrice extends BoxWeight {
    int price ;

    public BoxPrice() {
        super();     // if we donot call it here, it will called automatically
        this.price = 100;
    }

    public BoxPrice(BoxPrice other) {
        super(other);
        this.price=other.price;

    }

    public BoxPrice(int l, int b, int h, int weight, int price) {
        super(l, b, h, weight);
        this.price = price;
    }

}
