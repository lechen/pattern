package com.le.demo.pattern.observer.v0;

/**
 * Created by LE on 2017/3/21.
 * 发布者接口
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObserver();

}
