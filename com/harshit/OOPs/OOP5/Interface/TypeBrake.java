package com.harshit.OOPs.OOP5.Interface;

public class TypeBrake implements Brake{
    @Override
    public void start() {
        System.out.println("start Applying some brake ");
    }

    @Override
    public void power() {
        System.out.println("Pull the liver of power brake ");

    }
}
