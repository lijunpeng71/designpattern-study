package com.designpattern.study.command.tv;

import com.designpattern.study.command.Command;

public class TvOffCommand implements Command {

    private TvReceiver receiver;

    public TvOffCommand() {
    }

    public TvOffCommand(TvReceiver receiver) {
        super();
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
