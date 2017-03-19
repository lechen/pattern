package com.le.demo.pattern.strategy.v0.duck;

import com.le.demo.pattern.strategy.v0.fly.IFlyBehavior;
import com.le.demo.pattern.strategy.v0.quack.IQuackBehavior;

/**
 * Created by LE on 2017/3/19.
 */
public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }


    abstract void display();
}
