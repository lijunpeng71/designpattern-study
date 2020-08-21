package com.designpattern.study.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author administrator
 * @description:
 * @date:2020/8/21 15:05
 **/
public class WeatherData implements Subject {
    /**
     * 温度
     */
    private float temperature;

    /**
     * 压力
     */
    private float pressure;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 设置数据
     *
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }


    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    /**
     * 观察者集合
     */
    private List<Observer> observerList;


    @Override
    public void registerObserver(Observer observer) {
        if (observerList == null) {
            observerList = new ArrayList<>();
        }
        observerList.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        if (observerList == null) {
            return;
        } else {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        if (observerList == null) {
            return;
        }
        observerList.forEach(observer -> observer.update(temperature, pressure, humidity));
    }
}
