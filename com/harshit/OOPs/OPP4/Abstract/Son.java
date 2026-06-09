package com.harshit.OOPs.OPP4.Abstract;

public class Son extends Parent{
    public Son(int age) {
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
    void askAge(){
        System.out.println("I am "+age+ " years old");
    }
}
