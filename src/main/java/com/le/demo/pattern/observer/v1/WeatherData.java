package com.le.demo.pattern.observer.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by LE on 2017/3/21.
 */
public class WeatherData extends Observable {

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

    public void changeWeather(float temp, float humidity, float pressure){
        this.setTemperature(temp);
        this.setHumidity(humidity);
        this.setPressure(pressure);

        setChanged();
        notifyObservers();
    }


    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
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
