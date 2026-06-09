package com.harshit.OOPs.OPP4.Interface;

public class HydroEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Fill some water in the Hydro Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops the Hydro Engine");

    }

    @Override
    public void run() {
        System.out.println("Starts the Hydro Engine");

    }
}
