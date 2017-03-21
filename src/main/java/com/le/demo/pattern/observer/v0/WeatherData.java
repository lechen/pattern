package com.le.demo.pattern.observer.v0;

import java.util.ArrayList;

/**
 * Created by LE on 2017/3/21.
 */
public class WeatherData implements Subject {

    /**
     * 所有订阅者
     */
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    @Override
    public void registerObserver(Observer observer) {
        if (observer == null) {
            throw new NullPointerException();
        } else {
            if (!this.observers.contains(observer)) {
                this.observers.add(observer);
            }
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        if (observers != null && observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
