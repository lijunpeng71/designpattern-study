package com.designpattern.study.observe;

/**
 * @author administrator
 * @description:
 * @date:2020/8/21 14:21
 **/
public class ObserverClient {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        //注册观察者
        Observer baiduObserver = new BaiduSiteObserver();
        weatherData.registerObserver(baiduObserver);
        Observer sinaObserver = new SinaSiteObserver();
        weatherData.registerObserver(sinaObserver);
        weatherData.setData(12, 13, 15);
        weatherData.unRegisterObserver(sinaObserver);
        weatherData.setData(12, 14, 200);
    }
}
