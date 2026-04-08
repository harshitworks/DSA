package com.harshit.OOPs.OOP3.Polymorphism;

public class Objectprint {

    int num ;

    public Objectprint(int num) {
        this.num = num;
    }

    /*
    @Override   // here we are overridding the toString method of 'Object Class'
    public String toString() {
        return "Method Overided"+"@" + this.num;
    }

     */

    static void main(String[] args) {
        Objectprint obj = new Objectprint(454);
        System.out.println(obj);
    }
}
