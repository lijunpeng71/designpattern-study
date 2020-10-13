package com.designpattern.study.facade;

public class HomeTheaterFacade {
    //定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DvdPlayer dvdPlayer;


    public HomeTheaterFacade() {
        super();
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DvdPlayer.getInstance();
    }

    public void ready() {
        System.out.println("-------------ready-------------");
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }


    public void play() {
        System.out.println("-------------play-------------");
        dvdPlayer.play();
    }

    public void pause() {
        System.out.println("-------------pause-------------");
        dvdPlayer.pause();
    }

    public void end() {
        System.out.println("-------------end-------------");
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
