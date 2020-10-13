package com.designpattern.study.facade;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.ready();
        facade.play();

        facade.end();
    }
}
