package com.le.demo.pattern.strategy.v0.duck;

import com.le.demo.pattern.strategy.v0.fly.FlyWithWings;
import com.le.demo.pattern.strategy.v0.quack.Quack;

/**
 * Created by LE on 2017/3/19.
 * 红头鸭
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    void display() {
        System.out.println("red head duck !");
    }
}
