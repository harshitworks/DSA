package com.harshit.OOPs.OPP4.Abstract;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career(String msg){
        System.out.println("I want to be a "+msg);
    }
    @Override
    void partner(String msg){
        System.out.println("I loved "+ msg+" so much ");

    }

    @Override
    void askAge() {
        System.out.println("How Dare you !!");
    }
}
