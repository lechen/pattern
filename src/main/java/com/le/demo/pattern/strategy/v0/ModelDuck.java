package com.le.demo.pattern.strategy.v0;

/**
 * Created by LE on 2017/3/20.
 * 模型鸭子:不会叫;不会飞;
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.quackBehavior = new MuteQuack();
        this.flyBehavior = new FlyNoWay();
    }

    void display() {
        System.out.println(" I am is Model duck !");
    }
}
