package com.harshit.OOPs.OPP4.Interface;

public class ElectricEngine implements Engine {
    @Override
    public void start()
    {
        System.out.println("Starts the Electric Engine");
    }
    @Override
    public void stop()
    {
        System.out.println("charge the batteries");
    }

    @Override
    public void run() {
        System.out.println("Lets do some carbon emission ");
    }

}
