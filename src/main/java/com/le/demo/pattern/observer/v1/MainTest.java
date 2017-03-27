package com.le.demo.pattern.observer.v1;

import java.util.Observer;

/**
 * Created by LE on 2017/3/19.
 * 观察者模式
 * 基于jdk自带的功能实现
 */
public class MainTest {

    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        Observer ob1 = new Obs1(subject);
        Observer ob2 = new Obs2(subject);

        subject.changeWeather(10,20,30);
    }
}
