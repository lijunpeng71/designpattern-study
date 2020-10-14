package com.designpattern.study.command.light;

import com.designpattern.study.command.Command;

public class LightOnCommand implements Command {

    private LightReceiver receiver;

    public LightOnCommand() {
    }

    public LightOnCommand(LightReceiver receiver) {
        super();
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("execute receiver on");
        receiver.on();
    }

    @Override
    public void undo() {
        System.out.println("execute receiver undo");
        receiver.off();
    }
}
