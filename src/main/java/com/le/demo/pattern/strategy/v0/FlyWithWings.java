package com.le.demo.pattern.strategy.v0;

/**
 * Created by LE on 2017/3/19.
 */
public class FlyWithWings implements IFlyBehavior {
    public void fly() {
        System.out.println("fly with wings !");
    }
}