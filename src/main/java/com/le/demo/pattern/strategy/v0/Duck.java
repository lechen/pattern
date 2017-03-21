package com.le.demo.pattern.strategy.v0;

import com.le.demo.pattern.strategy.v0.IFlyBehavior;
import com.le.demo.pattern.strategy.v0.IQuackBehavior;

/**
 * Created by LE on 2017/3/19.
 *
 */
public abstract class Duck {
    /**
     * 委托
     */
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    abstract void display();

    /**
     * 实现setter是为了动态改变行为
     * @param flyBehavior
     */
    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
