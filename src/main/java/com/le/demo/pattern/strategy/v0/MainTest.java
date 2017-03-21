package com.le.demo.pattern.strategy.v0;

/**
 * Created by LE on 2017/3/19.
 * 策略模式:
 * 定义了算法簇,分别封装起来,让他们之间可以互相替换,
 * 此模式让算法的变化独立于使用算法的客户。
 */
public class MainTest {
    public static void main(String[] args) {
        // 构造方法中已经默认fly、quack
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.fly();
        modelDuck.quack();
        // 改变modelDuck的 fly、quack
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.setQuackBehavior(new Quack());
        modelDuck.fly();
        modelDuck.quack();


    }
}
