package com.harshit.OOPs.OOP5.Interface;

public class Car implements Music, Engine, Brake{
    // this is a normal car that is if you function have same name then only one of them will be executed , like funtion stop either can stop the music or the car
    @Override
    public void power() {
        System.out.println("Car power");
    }


    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void run() {
        System.out.println("Car run");

    }

    @Override
    public void play() {
        System.out.println("music play ");
    }

    @Override
    public void pause() {
        System.out.println("music pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop the music");
    }
}
