package com.le.demo.pattern.strategy.v0;

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
