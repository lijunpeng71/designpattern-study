package com.designpattern.study.command.tv;

import com.designpattern.study.command.Command;

public class TvOnCommand implements Command {

    private TvReceiver receiver;

    public TvOnCommand() {
    }

    public TvOnCommand(TvReceiver receiver) {
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
