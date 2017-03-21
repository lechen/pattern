package com.le.demo.pattern.strategy.v0;

/**
 * Created by LE on 2017/3/19.
 */
public class FlyNoWay implements IFlyBehavior {
    public void fly() {
        System.out.println("fly no way !");
    }
}
