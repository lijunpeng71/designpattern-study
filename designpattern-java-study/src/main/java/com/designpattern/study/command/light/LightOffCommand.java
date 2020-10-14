package com.designpattern.study.command.light;

import com.designpattern.study.command.Command;

public class LightOffCommand implements Command {

    private LightReceiver receiver;

    public LightOffCommand() {
    }

    public LightOffCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("execute receiver off");
        receiver.off();
    }

    @Override
    public void undo() {
        System.out.println("execute receiver undo");
        receiver.on();
    }
}
