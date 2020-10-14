package com.designpattern.study.command;

import com.designpattern.study.command.light.LightOffCommand;
import com.designpattern.study.command.light.LightOnCommand;
import com.designpattern.study.command.light.LightReceiver;
import com.designpattern.study.command.tv.TvOffCommand;
import com.designpattern.study.command.tv.TvOnCommand;
import com.designpattern.study.command.tv.TvReceiver;

public class Client {
    public static void main(String[] args) {
        //创建电灯对象
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯按钮相关的命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //创建一个电视对象
        TvReceiver tvReceiver = new TvReceiver();
        //创建电视按钮功能
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);
        //创建一个遥控器
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("----------------按下灯的开按钮---------------");
        remoteController.onButtonWasPushed(0);
        System.out.println("----------------按下灯的关按钮---------------");
        remoteController.offButtonWasPushed(0);
        System.out.println("----------------按下灯的撤销按钮---------------");
        remoteController.undoButtonWasPushed();
    }
}
