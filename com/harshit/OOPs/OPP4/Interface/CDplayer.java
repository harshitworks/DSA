package com.harshit.OOPs.OPP4.Interface;

public class CDplayer implements Music{
    public void play() {
        System.out.println("Starts the  Music");
    }

    @Override
    public void pause() {
        System.out.println("Pauses the  Music");

    }

    @Override
    public void stop() {
        System.out.println("Stops the  Music");
    }

}
