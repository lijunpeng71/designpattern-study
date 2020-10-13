package com.designpattern.study.facade;

public class DvdPlayer {

    private static DvdPlayer instance = new DvdPlayer();

    public static DvdPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" dvd on ");
    }

    public void off() {
        System.out.println(" dvd off");
    }

    public void play() {
        System.out.println(" dvd is playing");
    }


    public void pause() {
        System.out.println(" dvd pause ..");
    }
}
