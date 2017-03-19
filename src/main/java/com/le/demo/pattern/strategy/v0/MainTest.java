package com.le.demo.pattern.strategy.v0;

import com.le.demo.pattern.strategy.v0.duck.Duck;
import com.le.demo.pattern.strategy.v0.duck.MallardDuck;

/**
 * Created by LE on 2017/3/19.
 * 策略模式
 */
public class MainTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();

    }
}
