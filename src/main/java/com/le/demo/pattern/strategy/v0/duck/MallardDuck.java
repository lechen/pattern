package com.le.demo.pattern.strategy.v0.duck;

import com.le.demo.pattern.strategy.v0.fly.FlyNoWay;
import com.le.demo.pattern.strategy.v0.quack.Squeak;

/**
 * Created by LE on 2017/3/19.
 * 绿头鸭
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    void display() {
        System.out.println(" mallard duck !");
    }
}
