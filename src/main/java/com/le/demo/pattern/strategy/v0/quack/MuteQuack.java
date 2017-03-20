package com.le.demo.pattern.strategy.v0.quack;

import com.le.demo.pattern.strategy.v0.quack.IQuackBehavior;

/**
 * Created by LE on 2017/3/20.
 */
public class MuteQuack implements IQuackBehavior {
    public void quack() {
        System.out.println("no quack !");
    }
}
