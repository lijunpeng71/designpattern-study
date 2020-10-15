package com.designpattern.study.state.money;

class GenerateState extends AbstractState {

    @Override
    public void checkEvent(Context context) {
        context.setState(new ReviewState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }
}


class NotPayState extends AbstractState {

    @Override
    public void payOrderEvent(Context context) {
        context.setState(new PaidState());
    }

    @Override
    public void feedbackEvent(Context context) {
        context.setState(new FeedbackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.NOT_PAY.getValue();
    }
}

class PaidState extends AbstractState {

    @Override
    public String getCurrentState() {
        return StateEnum.PAID.getValue();
    }
}

class PublishState extends AbstractState {

    @Override
    public void acceptOrderEvent(Context context) {
        context.setState(new NotPayState());
    }

    @Override
    public void noPeopleAcceptEvent(Context context) {
        context.setState(new FeedbackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PUBLISHED.getValue();
    }
}

class ReviewState extends AbstractState {

    @Override
    public void makePriceEvent(Context context) {
        context.setState(new PublishState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.REVIEWED.getValue();
    }
}

class FeedbackState extends AbstractState {

    @Override
    public String getCurrentState() {
        return StateEnum.FEED_BACKED.getValue();
    }
}
