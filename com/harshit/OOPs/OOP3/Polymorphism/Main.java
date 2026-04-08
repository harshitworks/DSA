package com.harshit.OOPs.OOP3.Polymorphism;

public class Main {

    static void main(String[] args) {
        Shapes s = new Shapes();
        Square sq = new Square();
        Circle c = new Circle();
        Triangle t = new Triangle();

        Shapes ts = new Triangle();

        s.area();
        c.area();
        sq.area();
        t.area();
        System.out.println("---------------------------");
        ts.area();
    }

}
