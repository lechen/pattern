package com.le.demo.pattern.observer.v1;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by LE on 2017/3/27.
 */
public class Obs2 implements Observer {

    private Observable subject;
    /**
     * 温度
     */
    private float temp;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    public Obs2(Observable subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData)o;
            this.temp = data.getTemperature();
            this.humidity = data.getHumidity();
            this.pressure = data.getPressure();

            System.out.println(this.getClass().getSimpleName()
                    + " -- temp:" + temp
                    + ", humidity:" + humidity
                    + ", pressure:" + pressure);
        }
    }
}
