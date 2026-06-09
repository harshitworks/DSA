package com.harshit.OOPs.OPP4.Interface;

public class NiceCar {
    Engine engine ;
    Music music;
    Brake brake;

    public NiceCar() {
        this.engine= new HydroEngine() ;
        this.music = new CDplayer();
        this.brake = new TypeBrake();
    }
    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public NiceCar(Music music) {
        this.music = music ;
    }

    public void startEngine() {
        engine.start();
        engine.run();
    }
    public void stopEngine() {
        engine.stop();
    }

    public void startMusic () {
        music.play();
    }
    public void stopMusic() {
        music.stop();
    }
    public void applyBrakes() {
        brake.power();
    }





}
