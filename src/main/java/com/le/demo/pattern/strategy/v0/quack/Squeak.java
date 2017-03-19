package com.le.demo.pattern.strategy.v0.quack;

/**
 * Created by LE on 2017/3/19.
 */
public class Squeak implements IQuackBehavior {
    public void quack() {
        System.out.println("squeak squeak !");
    }
}
