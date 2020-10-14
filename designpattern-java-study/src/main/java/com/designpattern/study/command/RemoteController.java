package com.designpattern.study.command;

public class RemoteController {

    private Command[] onCommands;

    private Command[] offCommands;

    private Command undoCommand;

    /**
     * 初始化
     */
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 设置按钮命令
     *
     * @param no
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        this.onCommands[no] = onCommand;
        this.offCommands[no] = offCommand;
    }

    /**
     * 按下开按钮
     *
     * @param no
     */
    public void onButtonWasPushed(int no) {
        this.onCommands[no].execute();
        //记录当前操作，便于撤销
        this.undoCommand = onCommands[no];
    }

    /**
     * 按下关按钮
     *
     * @param no
     */
    public void offButtonWasPushed(int no) {
        this.offCommands[no].execute();
        //记录当前操作，便于撤销
        this.undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }
}
