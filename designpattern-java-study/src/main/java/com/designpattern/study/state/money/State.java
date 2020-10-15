package com.designpattern.study.state.money;

public interface State {
    /**
     * 电审
     *
     * @param context
     */
    void checkEvent(Context context);

    /**
     * 电审失败
     *
     * @param context
     */
    void checkFailEvent(Context context);

    /**
     * 定价发布
     *
     * @param context
     */
    void makePriceEvent(Context context);

    /**
     * 接单
     *
     * @param context
     */
    void acceptOrderEvent(Context context);

    /**
     * 无人接单
     *
     * @param context
     */
    void noPeopleAcceptEvent(Context context);

    /**
     * 付款
     *
     * @param context
     */
    void payOrderEvent(Context context);

    /**
     * 支付失败
     *
     * @param context
     */
    void orderFailureEvent(Context context);

    /**
     * 反馈
     *
     * @param context
     */
    void feedbackEvent(Context context);

    /**
     * 获取当前状态
     *
     * @return
     */
    String getCurrentState();
}
