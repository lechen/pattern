package com.le.demo.pattern.observer.v0;

/**
 * Created by LE on 2017/3/21.
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
