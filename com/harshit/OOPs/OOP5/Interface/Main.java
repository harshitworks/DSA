package com.harshit.OOPs.OOP5.Interface;

public class Main {
    static void main(String[] args) {
        Car car = new Car();
        car.power();
        car.stop();
        car.run();


        NiceCar niceCar = new NiceCar();
        niceCar.startEngine();
        niceCar.stopEngine();

        niceCar.engine= new ElectricEngine();
        niceCar.startEngine();;
        niceCar.startMusic();
        niceCar.stopMusic();
    }

}
