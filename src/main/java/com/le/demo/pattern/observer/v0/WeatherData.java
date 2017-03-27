package com.le.demo.pattern.observer.v0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LE on 2017/3/21.
 */
public class WeatherData implements Subject {

    /**
     * 所有订阅者
     */
    private List<Observer> observers = new ArrayList<Observer>();

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
        for (Observer observer :  this.observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    @Override
    public void changeWeatherData(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        this.notifyObserver();
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
