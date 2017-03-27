package com.le.demo.pattern.observer.v0;

/**
 * Created by LE on 2017/3/19.
 * 观察者模式:一对多;发布+订阅;
 *
 */
public class MainTest {

    public static void main(String[] args) {
        Subject subject = new WeatherData();
        Observer obs1 = new Obs1(subject);

        Observer obs2 = new Obs2(subject);
        subject.deleteObserver(obs2);

        subject.changeWeatherData(10, 11, 12);
    }
}
