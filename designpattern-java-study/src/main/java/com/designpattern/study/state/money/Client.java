package com.designpattern.study.state.money;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new PublishState());
        System.out.println(context.getCurrentState());

        context.acceptOrderEvent(context);

        context.payOrderEvent(context);
    }
}
