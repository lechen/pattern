package com.le.demo.pattern.observer.v0;

/**
 * Created by LE on 2017/3/27.
 */
public class Obs2 implements Observer{

    public Subject subject;

    public Obs2(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (subject instanceof WeatherData) {
            System.out.println(this.getClass().getSimpleName()
                    + " -- temp:" + temp
                    + ", humidity:" + humidity
                    + ", pressure:" + pressure);
        }
    }
}
